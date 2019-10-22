import java.util.Scanner;

public class Iterations {
    public static void main(String[] args){
        Scanner scan = new Scanner(System. in);
        System.out.println("Please enter number 7");

        int x;
       x = scan.nextInt();

        while ( x < 7 || x > 7)  {
            System.out.println("Thats not number 7");
            x = scan.nextInt();






        }
        System.out.println("Thank you");



    }
}
