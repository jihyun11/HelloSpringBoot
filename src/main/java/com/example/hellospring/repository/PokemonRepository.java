package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import com.example.hellospring.domain.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository {

    Pokemon save (Pokemon pokemon);
    List<Pokemon> findAll();
}
