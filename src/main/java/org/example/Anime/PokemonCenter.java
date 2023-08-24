package org.example.Anime;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonCenter {
    public void heal(Pokemon pokemon) {
        System.out.println("Healing " + pokemon.getName());
        pokemon.setHealth(pokemon.getMaxHealth());
    }

    public void heal(List<Pokemon> pokemons) {
        System.out.println("Healing multiple Pokemons");
        pokemons.stream().forEach(pokemon -> heal(pokemon));
    }
}
