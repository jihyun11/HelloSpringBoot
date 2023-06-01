package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import com.example.hellospring.domain.Pokemon;
import com.example.hellospring.repository.PokemonRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class PokemonService {
    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> find() {
        return pokemonRepository.findAll();
    }
}
