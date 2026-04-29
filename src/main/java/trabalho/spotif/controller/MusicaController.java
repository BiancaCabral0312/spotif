package trabalho.spotif.controller;


import org.springframework.web.bind.annotation.*;
import trabalho.spotif.model.Musica;
import trabalho.spotif.service.MusicaService;

import java.util.List;

@RestController
public class MusicaController {

    private final MusicaService musicaService = new MusicaService();

    @PostMapping("/musica")
    public String musica(@RequestBody Musica musica) {

        Musica musicaAdicionada  = musicaService.adicionarMusica(musica);

        System.out.println("musicaAdicionada: " + musicaAdicionada.getTitulo());

        return musicaAdicionada.getTitulo();
    }

    @GetMapping("/listartodos")
    public List<Musica> listarMusicas() {

        List<Musica> musicasRetornadas = musicaService.listarMusicas();

        for (Musica musica : musicasRetornadas) {
            System.out.println(musica.getTitulo());
        }

        return musicasRetornadas;
    }


    @PostMapping("/buscarporid")
    public Musica buscarPorId(@RequestParam int id){

        Musica musicaAchada = musicaService.buscarPorId(id);

        return musicaAchada;
    }

    @PostMapping("/removerporid")
    public void removerPorId(@RequestParam int id){

        musicaService.removerporId(id);
    }


}
