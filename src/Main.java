import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] p = new int[3];
        p[0] = 1;
        p[1] = 2;
        p[2] = 3;
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        System.out.println();
        double[] numbers = {1.57, 7.654, 9.986};
        numbers[0] = 1.57;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numb = {5, 10, 15, 20, 25};
        numbers[0] = 5;
        for (int i = 0; i < numb.length; i++) {
            System.out.print(numb[i]);
            if (i != numb.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] r = new int[]{1, 2, 3};
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
            if (i != r.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] num = {1.57, 7.654, 9.986};
        num[0] = 1.57;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i != num.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] r = new int[]{1, 2, 3};
        for (int i = r.length - 1; i >= 0; i--) {
            System.out.print(r[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] num = {1.57, 7.654, 9.986};
        num[0] = 1.57;
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] % 2 != 0 ) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

