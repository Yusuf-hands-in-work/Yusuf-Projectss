public class Arrays4 {
    public static void main(String[] args) {



        int number = 0;
        int [] arr = new int[10];
        int temp;
        for (int i = 0; i<arr.length; i++){
            int money = (int)(Math.random()*100 + 1);
            arr[i] = money;
            System.out.println("   ");
            System.out.println("Index: " + i + "    Value: " + arr[i]);

            number = number + money;



        }


        System.out.println("  ");
        System.out.println("___________________________________________________________");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Your average is  " +  number/arr.length);
        System.out.println(" ");
        System.out.println("___________________________________________________________");
        System.out.println(" ");
        System.out.println("If we switch index position 3 and 5 the order would be:");
        System.out.println("___________________________________________________________");



        temp = arr[3];
        arr[3] = arr[5];
        arr[5] = temp;

        for (int i = 0; i<arr.length;i++){
            System.out.println("  ");
            System.out.println("Index: " + i + " Value: " + arr[i]);



        }





        for (int i = 0; i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

        for (int i = 0; i<arr.length;i++){
            System.out.println("Index: " + i + " Value: " + arr[i]);
        }


    }

}



