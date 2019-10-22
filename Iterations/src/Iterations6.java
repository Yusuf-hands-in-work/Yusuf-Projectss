import java.util.Scanner;

public class Iterations6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("Please enter a range of numbers you would like to factor 7 into");
        int low, highest, number;
        System.out.println("Please enter the lowest number of the range");
        low = scan.nextInt();
        System.out.println("Please enter the highest number of the range");
        highest = scan.nextInt();
        number = 0;

        for (int i = low;  i <= highest;i++){
            if (i%7 == 0){
                System.out.println(i + " is a factors");
                System.out.println(" ");
                number = number + 1;
            }

        }


        if (number != 1){
            System.out.println("There are " + number + " factors.");
        }
        else if (number == 1){
            System.out.println("There is " + number + " factor.");
        }
    }
}
