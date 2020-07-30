package com.wgcostta.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class TestFlux {

    @Test
    void testeFlux1(){
        Flux.empty();
    }

    @Test
    void testeFlux2(){
        Flux<String> flux = Flux.just("String");
        flux.subscribe(System.out::println);
    }

    @Test
    void testeFlux3(){
        Flux<String> flux = Flux.just("Sharizard","Blastoize","Pikachu");
        flux.subscribe(System.out::println);
    }
}
