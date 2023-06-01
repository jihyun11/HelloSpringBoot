package com.example.hellospring.controller;

import com.example.hellospring.domain.Member;
import com.example.hellospring.domain.Pokemon;
import com.example.hellospring.repository.JpaPokemonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PokemonController {

        private final JpaPokemonRepository jpaPokemonRepository;

    public PokemonController(JpaPokemonRepository jpaPokemonRepository) {
        this.jpaPokemonRepository = jpaPokemonRepository;
    }
//    private final PokemonRepository pokemonRepository;
//
//
//    public PokemonController(PokemonRepository pokemonRepository) {
//        this.pokemonRepository = pokemonRepository;
//    }

    @GetMapping("pokemon")
    public String pokemon() {
        return "pokemon";
    }

    @GetMapping("pokemonpick")
    public String pokemonpick() {
        return "pokemonpick";
    }

    @PostMapping("/pokemon")
    public String pick(Model model) {
        List<Pokemon> pokemon = jpaPokemonRepository.findAll();
        model.addAttribute("pokemon", pokemon);

        return "members/pokemonpick";
    }




}
