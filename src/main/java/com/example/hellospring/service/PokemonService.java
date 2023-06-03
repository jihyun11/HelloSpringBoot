package com.example.hellospring.service;

import com.example.hellospring.domain.Pokemon;
import com.example.hellospring.repository.PokemonRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class PokemonService {

    private final EntityManager em;
    private final PokemonRepository pokemonRepository;

    public PokemonService(EntityManager em, PokemonRepository pokemonRepository) {
        this.em = em;
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> find() {
        return pokemonRepository.findAll();
    }

    public void save(Pokemon pokemon) {
        em.persist(pokemon);
    }
}
