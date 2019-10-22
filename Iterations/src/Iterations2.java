import java.util.Scanner;

public class Iterations2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("Pick a number");
        int  number, times;
        number = scan.nextInt();
        System.out.println("how many times would you like to multiply that?");
        times = scan.nextInt();
        for (int i = 0; i < times;i++){
            number = number * 2;
            System.out.println(number);




        }










    }
}
