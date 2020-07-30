package com.wgcostta.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class TestMono {

    @Test
    public void testeMono1(){
        Mono<String> mono = Mono.empty();
    }

    @Test
    public void testeMono2(){
        Mono<String> mono = Mono.just("Pokemon");
        mono.subscribe(System.out::println);
    }

    @Test
    public void testeMono3(){
        Mono<Integer> mono = Mono.just(10);
        mono.subscribe(System.out::println);
    }
}
