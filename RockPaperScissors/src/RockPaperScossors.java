import java.util.Scanner;

public class RockPaperScossors {
    public static void main(String[] args) {


        String RandomChoice = "";
        int randomNumber = (int)(Math.random()*3+1);
        int loss = 0;
        int won = 0;

        Scanner scan = new Scanner(System. in);
        System.out.println("Welcome to Scissors, Paper, Rock!");
        System.out.println("The goal of this game is to choose 1 of 3 options (paper, scissors, or rock) and have one that beats your opponents option.");
        System.out.println("Rock beats scissors, paper beats rock and scissors beats paper. (Make sure to type in lower case)");
        System.out.println("Choose wisely, your opponent is Monkey!");
        System.out.println(" ");
        if (randomNumber == 1){
            RandomChoice = "Scissors";
        }
        else if (randomNumber == 2){
            RandomChoice = "Paper";
        }
        else if (randomNumber == 3){
            RandomChoice = "Rock";
        }
        System.out.println("To start the game press 1");

        String Choice = scan.next();
        int play = scan.nextInt();
        while(play == 1 ){



            System.out.println("What do you Choose (rock, paper, Or scissors)?");

            Choice = scan.next();

            if (RandomChoice.equals("Paper") && Choice.equals("scissors")) {
                System.out.println(" ");
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("Congratulations, you won.");
                won = won + 1;

            } else if (RandomChoice.equals("Paper") && Choice.equals("rock")) {
                System.out.println(" ");
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("Unfortunately you have lost.");
                loss = loss + 1;
            } else if (RandomChoice.equals("Paper") && Choice.equals("paper")){
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("This is a tie. nobody won.");

            }

             if (RandomChoice.equals("Rock") && Choice.equals("rock")) {
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("This is a tie. nobody won.");
            } else if (RandomChoice.equals("Rock") && Choice.equals("paper")) {
                System.out.println("  ");
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("Congratulations, you won.");
                won = won + 1;
            } else if (RandomChoice.equals("Rock") && Choice.equals("scissors")){
                System.out.println("  ");
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("Unfortunately you have lost.");
                loss = loss + 1;
            }


             if (RandomChoice.equals("Scissors") && Choice.equals("scissors")) {
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("This is a tie. nobody won.");
            } else if (RandomChoice.equals("Scissors") && Choice.equals("rock")) {
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("Congratulations, you won.");
                won = won + 1;
            } else if (RandomChoice.equals("Scissors") && Choice.equals("paper")){
                System.out.println("You chose " + Choice + ", and Monkey chose.... ");
                System.out.println(" ");
                System.out.println(RandomChoice + "!");
                System.out.println("Unfortunately you have lost.");
                loss = loss + 1;
            }


            System.out.println(" ");
            System.out.println("************************************************************************");
            System.out.println("wins = " + won + " Losses = " + loss);
            System.out.println(" ");
            System.out.println("would you like to play again? Type 1 for Yes and 2 for no.");

            play = scan.nextInt();


        }
        System.out.println(" ");
        System.out.println("Thank you for playing, see you next time!");
    }
}
