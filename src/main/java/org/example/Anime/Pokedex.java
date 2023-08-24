package org.example.Anime;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Pokemon> pokemons;

    public Pokedex() {
        pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void listPokemons() {
        pokemons.stream()
                .forEach(pokemon -> System.out.println(pokemon.getName() + " - " + pokemon.getType()));
    }
}
