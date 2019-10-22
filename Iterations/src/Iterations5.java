import java.util.Scanner;

public class Iterations5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("Enter a password");
        String password = scan.next();
        System.out.println("Please re-enter the password");

        while (!password.equals(scan.next())){
            System.out.println("That doesn't match");
        }
        System.out.println("Thank you for creating a password");

    }
}
