package src.DefiningClassesExercise.P06_PokemonTrainer;

import java.util.List;

public class Trainer {
    private String name;
    private int badges = 0;
    private List <Pokemon> pokemonList;

    public Trainer(String name, List<Pokemon> pokemonList) {
        this.name = name;
        this.pokemonList = pokemonList;
    }

    public List<Pokemon> getPokemonList() {
        return this.pokemonList;
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public boolean hasPokemonType(String type){
        boolean hasPokemonType = false;
        List <Pokemon> pokemonList = getPokemonList();

        for (Pokemon pokemon : pokemonList) {
            if(pokemon.getElement().equals(type)){
                hasPokemonType = true;
            }
        }
        return hasPokemonType;
    }

    public void doIfHasElement () {
        this.badges ++;
    }
    public void doIfNotHaveElement () {
        List<Pokemon> pokemonList = getPokemonList();

            for (Pokemon pokemon : pokemonList) {
                pokemon.setHealth(pokemon.getHealth() - 10);

                if (pokemon.getHealth() < 0) {
                    pokemonList.remove(pokemon);
                    if (pokemonList.isEmpty()) {
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",this.name,this.badges,this.pokemonList.size());
    }
}
