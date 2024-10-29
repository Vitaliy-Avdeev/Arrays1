import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var taskOne = ("Задача №1");
        System.out.println(taskOne);

        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        int[] arrayFree = {46, 86, 63, 98, 0, 0,};
        var taskTwo = ("Задача №2");
        System.out.println(taskTwo);
        for (var i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]);
            if (i < arrayOne.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i]);
            if (i < arrayTwo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayFree.length; i++) {
            System.out.print(arrayFree[i]);
            if (i < arrayFree.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        var taskFree = ("Задача №3");
        System.out.println(taskFree);
        for (var i = arrayOne.length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i]);
            if (i >= arrayOne.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.print(arrayTwo[i]);
            if (i >= arrayTwo.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayFree.length - 1; i >= 0; i--) {
            System.out.print(arrayFree[i]);
            if (i >= arrayFree.length - 5) {
                System.out.print(", ");
            }
        }
        System.out.println();

        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        for (var i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayOne));

    }
}

