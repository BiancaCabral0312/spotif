package trabalho.spotif.model;

public class Musica {

    public int id;
    public String artista;
    public String titulo;
    public String ulrCapaDoAlbum;
    public int ano;
    public GenerosMusicais estilosMusical;

    public Musica() {
    }

    public Musica(int id, String titulo, String artista, String ulrCapaDoAlbum, int ano, GenerosMusicais estilosMusical) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.ulrCapaDoAlbum = ulrCapaDoAlbum;
        this.ano = ano;
        this.estilosMusical = estilosMusical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUlrCapaDoAlbum() {
        return ulrCapaDoAlbum;
    }

    public void setUlrCapaDoAlbum(String ulrCapaDoAlbum) {
        this.ulrCapaDoAlbum = ulrCapaDoAlbum;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public GenerosMusicais getEstilosMusical() {
        return estilosMusical;
    }

    public void setEstilosMusical(GenerosMusicais estilosMusical) {
        this.estilosMusical = estilosMusical;
    }
}
