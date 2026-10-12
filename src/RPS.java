import java.util.Scanner;

public class RPS
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        String playerA = "";        //players A's move
        String playerB = "";        //players B's move
        String playAgain = "";      //y or n answer

        //outer loop: play the game again while the user says y
        do {       //get player A's move, loop until it is R, P or S
            do {
                System.out.print("Player A: Enter your selection (R/P/S): ");
                playerA = input.nextLine();
                if (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Invalid selection. You must enter R, P, or S.");
                }

            }
            while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"));

            // get player B's move the same way
            do {
                System.out.println("Player B: Enter your selection (R/P/S): ");
                playerB = input.nextLine();
                if (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S")) {
                    System.out.println("Invalid selection. You must enter R, P, or S.");
                }

            }
            while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"));

            // cross product: check player A's move, then player B's move inside it
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock - It's a tie!");
                }
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock, Player B wins!");
                }
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors, player A wins!");
                }
            }


            if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers rock, Player A wins!");
                }
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs paper, its a tie");
                }
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts paper, player B wins!");
                }
            }

            if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks scissors, player B wins!");
                }
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper, Player A wins!");
                }
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors, it's  a tie!");
                }
            }

            //ask to play again, loop until answer is Y or N
            do {
                System.out.println("Do you want to play again? (Y/N)");
                playAgain = input.nextLine();
                if (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Invalid selection. You must enter Y or N.");
                }
            }
            while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"));


            System.out.println(); // blank line between games

        }
        while (playAgain.equalsIgnoreCase("Y")); // start over if they say Y

        System.out.println("Thanks for playing!");







    }
}
