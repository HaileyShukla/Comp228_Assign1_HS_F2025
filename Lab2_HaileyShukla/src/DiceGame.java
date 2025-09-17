import java.security.SecureRandom;
import java.util.Scanner;

public class DiceGame {

    // Winning totals on the first roll
    static int[] wins = {7, 11, 15, 21};
    // Losing totals
    static int[] losses = {10, 12, 19, 20, 22, 23, 24};

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        SecureRandom ranNum = new SecureRandom();

        System.out.println("=== Four Dice Game ===");
        System.out.println("Press Enter to roll the dice...");
        input.nextLine();

        int goal = 0;
        int total = rollFourDice(ranNum);

        if (playerWins(total)) {
            System.out.println("You win!");
            input.close();
            return;
        } else if (playerLoses(total)) {
            System.out.println("You lose!");
            input.close();
            return;
        } else {
            goal = total;
            System.out.println("Your goal is now " + goal + ". Roll it again to win!");
        }

        while (true) {
            System.out.println("Press Enter to roll again...");
            input.nextLine();
            total = rollFourDice(ranNum);

            if (total == goal) {
                System.out.println("You hit the goal. You win!");
                break;
            } else if (playerLoses(total)) {
                System.out.println("You lose!");
                break;
            } else {
                System.out.println("Still chasing goal: " + goal);
            }
        }

        System.out.println("Game over.");
        input.close();
    }

    static int rollFourDice(SecureRandom ranNum) {
        int total = 0;
        System.out.print("You rolled: ");
        for (int i = 0; i < 4; i++) {
            int randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber + " ");
        }
        System.out.println("\nTotal: " + total);
        return total;
    }

    static boolean playerWins(int dieSum) {
        for (int i = 0; i < wins.length; i++) {
            if (dieSum == wins[i]) {
                return true;
            }
        }
        return false;
    }

    static boolean playerLoses(int dieSum) {
        if (dieSum == 13) {
            return true;
        }
        for (int i = 0; i < losses.length; i++) {
            if (dieSum == losses[i]) {
                return true;
            }
        }
        return false;
    }
}
