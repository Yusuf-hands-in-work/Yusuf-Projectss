import java.util.Scanner;

public class Iterations4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("how many grades would you like to enter");
        int amount, grades;
        amount = scan.nextInt();
        grades = 0;

        for (int i = 0; i<amount;i++){
            System.out.println("Enter your marks here:");
            grades = grades + scan.nextInt();


        }
        System.out.println("your sum of grades is " + grades + " and your average is " + grades/amount);
    }
}
