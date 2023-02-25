package src.DefiningClassesExercise.P06_PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Trainer> trainerList = new ArrayList<>();
        Map<String, List<Pokemon>> pokemonMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Tournament")) {
            String[] inputArr = input.split(" ");
            String trainerName = inputArr[0];
            String pokemonName = inputArr[1];
            String pokemonElement = inputArr[2];
            int pokemonHealth = Integer.parseInt(inputArr[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            pokemonMap.putIfAbsent(trainerName, new ArrayList<>());
            pokemonMap.get(trainerName).add(pokemon);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Pokemon>> entry : pokemonMap.entrySet()) {
            Trainer trainer = new Trainer(entry.getKey(), entry.getValue());
            trainerList.add(trainer);
        }


        String elementCommand = scanner.nextLine();

        while (!elementCommand.equals("End")) {
            switch (elementCommand) {
                case "Fire":
                case "Water":
                case "Electricity":
                    for (Trainer trainer : trainerList) {
                        if (trainer.hasPokemonType(elementCommand)) {
                            trainer.doIfHasElement();
                        } else {
                            trainer.doIfNotHaveElement();
                        }
                    }
            }
            elementCommand = scanner.nextLine();
        }
        trainerList.sort(Comparator.comparing(Trainer::getBadges).reversed());

        for (Trainer trainer : trainerList) {
            System.out.println(trainer.toString());
        }
    }
}
