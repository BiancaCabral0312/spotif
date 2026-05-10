package trabalho.spotif.service;

import org.springframework.stereotype.Service;
import trabalho.spotif.model.Musica;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicaService {

    private final List<Musica> musicas = new ArrayList<>();

    public Musica adicionarMusica(Musica musica) {
        musicas.add(musica);
        return musica;
    }

    public List<Musica> listarMusicas() {
        return musicas;
    }

    public Musica buscarPorId(int id) {
        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }

        return null;
    }

    public void removerporId(int id) {
        musicas.removeIf(musica -> musica.getId() == id);
    }
}