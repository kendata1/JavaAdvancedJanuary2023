package MultidimensionalArraysExercise;

import java.util.Scanner;

public class P08_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double playerDamage = Double.parseDouble(scanner.nextLine());
        double playerHitPoints = 18500;
        double heiganHitPoints = 3000000;

        int playerRow = 7;
        int playerCol = 7;

        String lastSpell = "";

        while(true){

            if (playerHitPoints > 0) {
                heiganHitPoints -= playerDamage;
            }
            if (lastSpell.equals("Cloud")){
                playerHitPoints -= 3500;
            }
            if (playerHitPoints <= 0 || heiganHitPoints <= 0){
                break;
            }

            String [] inputArr = scanner.nextLine().split(" ");
            String spell = inputArr[0];
            int targetRow = Integer.parseInt(inputArr[1]);
            int targetCol = Integer.parseInt(inputArr[2]);


            if (isInDamageArea(targetRow,targetCol,playerRow,playerCol)) {
                if (!isInDamageArea(targetRow, targetCol, playerRow - 1, playerCol) && !isWall(playerRow - 1)) {
                    playerRow--;
                    lastSpell = "";
                } else if (!isInDamageArea(targetRow, targetCol, playerRow, playerCol + 1) && !isWall(playerCol + 1)) {
                    playerCol ++;
                    lastSpell = "";
                } else if (!isInDamageArea(targetRow, targetCol, playerRow + 1, playerCol) && !isWall(playerRow + 1)) {
                    playerRow ++;
                    lastSpell = "";
                } else if (!isInDamageArea(targetRow, targetCol, playerRow, playerCol - 1) && !isWall(playerCol - 1)) {
                    playerCol --;
                    lastSpell = "";
                } else {
                    if(spell.equals("Cloud")){
                        lastSpell = "Cloud";
                        playerHitPoints -= 3500;
                    } else if (spell.equals("Eruption")){
                        lastSpell = "Eruption";
                        playerHitPoints -= 6000;
                    }
                }
            }
        }
        lastSpell = lastSpell.equals("Cloud") ? "Plague Cloud" : "Eruption";
        String heiganState = heiganHitPoints <= 0 ? "Heigan: Defeated!" : String.format("Heigan: %.2f", heiganHitPoints);
        String playerState = playerHitPoints <= 0 ? String.format("Player: Killed by %s", lastSpell) :
                String.format("Player: %.0f", playerHitPoints);
        String playerEndCoordinates = String.format("Final position: %d, %d", playerRow, playerCol);

        System.out.println(heiganState);
        System.out.println(playerState);
        System.out.println(playerEndCoordinates);
    }


    public static boolean isWall (int moveCell){
        return moveCell < 0 || moveCell >= 15;
    }
    private static boolean isInDamageArea(int targetRow, int targetCol, int moveRow, int moveCol) {
        return ((targetRow - 1 <= moveRow && moveRow <= targetRow + 1)
                && (targetCol - 1 <= moveCol && moveCol <= targetCol + 1));
    }
}
