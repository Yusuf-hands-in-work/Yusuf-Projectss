import java.util.Scanner;

public class RockPaperScossors {
    public static void main(String[] args) {


        String RandomChoice = "";
        int randomNumber = (int)(Math.random()*3+1);
        Scanner scan = new Scanner(System. in);
        System.out.println("Welcome to Scissors, Paper, Rock!");
        System.out.println("The goal of this game is to choose 1 of 3 options (paper, scissors, or rock) and have one that beats your opponents option.");
        System.out.println("Rock beats scissors, paper beats rock and scissors beats paper.");
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
        System.out.println("Monkey chooses " + RandomChoice + "!");
        System.out.println(" ");
        if (randomNumber == 1){
            System.out.println("If you chose Rock you win :), if you chose paper you got chopped :(");
        }
        else if (randomNumber == 2){
            System.out.println("If you chose Scissors you win :), if you chose rock you got covered :(");
        }
        else if (randomNumber == 3){
            System.out.println("If you chose Paper you win :), if you chose scissors you got crushed :(");
        }





    }
}
