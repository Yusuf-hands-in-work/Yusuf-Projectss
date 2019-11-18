public class Arrays {
    public static void main(String[] args) {
        int number = 0;
        int[] arr = new int[20];
        for (int i = 0; i<arr.length;i++){
            int index = (int)(Math.random()*6 + 1);
            arr[i] = index;
            System.out.println("Index: " + i + "    Value: " + arr[i]);

            if (index == 1){
                number = number +1;



            }

        }
        System.out.println(" ");
        System.out.println("you had " + number + " 1's");


    }
}
