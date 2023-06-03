package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import com.example.hellospring.domain.Pokemon;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JpaPokemonRepository implements PokemonRepository{

    private final EntityManager em;

    public JpaPokemonRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Pokemon save(Pokemon pokemon) {
        em.persist(pokemon);
        return pokemon;
    }

    @Override
    public List<Pokemon> findAll() {
        List<Pokemon> result = em.createQuery("select m from Pokemon m", Pokemon.class).getResultList(); //객체를 대상으로 쿼리를 날림
        return result;
    }
}
