public class Arrays2 {
    public static void main(String[] args) {
        int number = 0;
        int [] arr = new int[10];
        for (int i = 0; i<arr.length; i++){
            int index = (int)(Math.random()*100 + 1);
            arr[i] = index;
            System.out.println("  ");
            System.out.println("Index: " + i + "    Value: " + arr[i]);




            number = number + index;

        }
        System.out.println("  ");
        System.out.println("_________________________________________________");
        System.out.println(" ");
        System.out.println("Your average is  " +  number/arr.length);







    }

}
