package org.example.Anime;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        pokemons = new ArrayList<>();
    }

    public void catchPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void listPokemons() {
        System.out.println(name + "'s Pokemons:");
        pokemons.stream()
                .forEach(pokemon -> System.out.println(pokemon.getName() + " - " + pokemon.getType()));
    }
}
