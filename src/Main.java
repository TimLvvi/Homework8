import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1"); // Задача №1
        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        float[] arrayTwo = {1.57f, 7.654f, 9.986f};



        System.out.println("Задача №2"); // Задача №2
        System.out.println(Arrays.toString(arrayOne).replace("[","").replace("]",""));
        System.out.println(Arrays.toString(arrayTwo).replace("[","").replace("]",""));
        System.out.println();



        System.out.println("Задача №3"); // Задача №3
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayOne[i]);
            } else {
                System.out.print(arrayOne[i] + ", ");
            }
        }
        System.out.println();

        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayTwo[i]);
            } else {
                System.out.print(arrayTwo[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();



        System.out.println("Задача №4"); // Задача №4
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayOne));

















    }
}