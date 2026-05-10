package trabalho.spotif.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import trabalho.spotif.model.GenerosMusicais;
import trabalho.spotif.model.Musica;
import trabalho.spotif.service.MusicaService;

@Controller
public class MusicaController {

    private final MusicaService musicaService;

    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @GetMapping({"/", "/musicas"})
    public String listar(Model model) {
        model.addAttribute("musicas", musicaService.listarMusicas());
        model.addAttribute("generos", GenerosMusicais.values());
        model.addAttribute("musicaForm", new Musica());
        return "home";
    }

    @GetMapping("/musicas/adicionar")
    public String paginaAdicionar(Model model) {
        model.addAttribute("musicaForm", new Musica());
        model.addAttribute("generos", GenerosMusicais.values());
        model.addAttribute("musicas", musicaService.listarMusicas());
        return "adicionar";
    }

    @GetMapping("/musicas/removerPagina")
    public String paginaRemover(Model model) {
        model.addAttribute("musicas", musicaService.listarMusicas());
        return "remover";
    }

    @PostMapping("/musicas")
    public String adicionar(@ModelAttribute("musicaForm") Musica musica) {
        musicaService.adicionarMusica(musica);
        return "redirect:/musicas";
    }

    @PostMapping("/musicas/remover")
    public String remover(@RequestParam int id) {
        musicaService.removerporId(id);
        return "redirect:/musicas";
    }

    @PostMapping("/musicas/buscar")
    public String buscar(@RequestParam int id, Model model) {
        Musica musicaAchada = musicaService.buscarPorId(id);

        model.addAttribute("musicas", musicaService.listarMusicas());
        model.addAttribute("generos", GenerosMusicais.values());
        model.addAttribute("musicaForm", new Musica());
        model.addAttribute("musicaBuscada", musicaAchada);
        model.addAttribute("buscaRealizada", true);

        return "home";
    }
}