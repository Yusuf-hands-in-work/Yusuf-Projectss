import java.util.Scanner;

public class Iterations3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("Please enter your age");
        int x;
        x = scan.nextInt();

        while (x < 10 || x > 50){


                 System.out.println("sorry, you are not eligible, enter an eligible age");
                x = scan.nextInt();



        }
        System.out.println("Thank you, you are eligible");
    }
}
