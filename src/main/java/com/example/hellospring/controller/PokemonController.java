package com.example.hellospring.controller;

import com.example.hellospring.domain.Member;
import com.example.hellospring.domain.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokemonController {

    @GetMapping("pokemon")
    public String pokemon() {
        return "pokemon";
    }

    @GetMapping("pokemonpick")
    public String pokemonpick() {
        return "pokemonpick";
    }

    @PostMapping("/pokemon")
    public String pick(Pokemon pokemon) {
        Pokemon pk = new Pokemon();
        pk.setPokemon(PokemonFrom.getPokemon());
        System.out.println(PokemonFrom.getPokemon());

        return "redirect:/pokemon";
    }



}
