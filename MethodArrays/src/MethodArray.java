import java.util.Scanner;

public class MethodArray {
    static int[] give(int[] arr,int num) {
        int[] next = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            next[i] = arr[i];
            next[next.length - 1] = num;
        }

        return next;
    }
    static int[] take(int[] arr) {
            int[] pop = new int[arr.length-1];
            for (int i = 0; i < arr.length-1; i++) {
                pop[i] = arr[i];
            }
            return pop;
        }
    static int[] put(int[] arr) {
        int[] drop = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            drop[i] = arr[i];
        }
        return drop;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10];


        for (int i = 0; i<arr.length;i++) {


            int index = (int) (Math.random() * 10 + 1);
            arr[i] = index;
            System.out.println("  ");
            System.out.println("Index: " + i + "    Value: " + arr[i]);
        }

        System.out.println("__________________________________________________________________________________________");
        System.out.println(" ");
        System.out.println("Lets add another index:");
        System.out.println("__________________________________________________________________________________________");

            int[]next = give(arr,(int) (Math.random()*10+1));

        
        for (int i = 0; i< arr.length + 1 ; i++){
            System.out.println("    ");

            if (i < 10){
                System.out.println("Index: " + i + "    Value: " + next[i]);
            }
            else if (i >= 10){
                System.out.println("Index: " + i + "   Value: " + next[i]);
            }
        }

        System.out.println("__________________________________________________________________________________________");
        System.out.println(" ");
        System.out.println("Lets delete an index from the original array");
        System.out.println("__________________________________________________________________________________________");
        int[] blop = take(arr);
        for (int i = 0; i < arr.length-1; i++){
            System.out.println(" ");
            System.out.println("Index: " + i + "    Value: " + blop[i]);

        }

        System.out.println("__________________________________________________________________________________________");
        System.out.println("Lets add an index point somewhere in the middle");
        System.out.println(" ");
        System.out.println("Pick an index point between 1-10:");
        int place = scan.nextInt();
        System.out.println("_________________________________________________________________________________________");

        while (place > 10) {
            System.out.println("oh, I forgot to mention to make sure the number is between 1-10: ");
            place = scan.nextInt();
        }
        System.out.println("What value would you like to put there?");
        int value = scan.nextInt();
        int[] drop = put(arr);
        System.out.println(" ");
        System.out.println("Aight we put your value "+ value + "in the index point " + place);

        for (int i = 0; i < place + 1; i++) {
            drop[place] = value;
            System.out.println(" ");
            System.out.println("Index: " + i + "   Value: " + drop[i]);
        }
        for (int i = place + 1; i < arr.length+1; i++) {
            drop[i] = arr[i-1];
            if (i < 10) {
                System.out.println(" ");
                System.out.println("Index: " + i + "   Value: " + drop[i]);

            }
            else if (i >= 10) {
                System.out.println(" ");
                System.out.println("Index: " + i + "  Value: " + drop[i]);
            }
        }





    }
}
