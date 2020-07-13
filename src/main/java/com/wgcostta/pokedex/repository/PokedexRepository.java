package com.wgcostta.pokedex.repository;

import com.wgcostta.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon,String> {
}
