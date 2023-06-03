package com.example.hellospring.controller;

import com.example.hellospring.domain.Pokemon;
import com.example.hellospring.repository.JpaPokemonRepository;
import com.example.hellospring.service.PokemonService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Slf4j
public class PokemonController {

        private final JpaPokemonRepository jpaPokemonRepository;

        private final PokemonService ps;

    public PokemonController(JpaPokemonRepository jpaPokemonRepository, PokemonService ps) {
        this.jpaPokemonRepository = jpaPokemonRepository;
        this.ps = ps;
    }


    @GetMapping("pokemon")
    public String pokemon() {

        System.out.println("포켓몬 거침");
        return "pokemon";
    }

    @GetMapping("pokemonpick")
    public String pokemonpick(Model model) {
        List<Pokemon> pokemons = ps.find();
        model.addAttribute("pokemon", pokemons.get(0).getPokemon());

        return "pokemonpick";
    }

    @PostMapping("/pokemon")
    public String pick(Model model, HttpServletRequest req) {
        Pokemon pk = new Pokemon();
        pk.setPokemon(req.getParameter("pokemon"));
        ps.save(pk);

        return "redirect:/pokemon";
    }




}
