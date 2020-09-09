package labs;

import java.util.Random;

public class arrayStats_lab1 {
    public static void main (String[]arg){
        int [] A1;  // builds reference but no memory is allocated
        A1 = new int[20];   // memory is now allocated

        Random rand = new Random();

        for (int i = 0; i < A1.length; i ++){
            A1[i] = rand.nextInt(500 - 100 + 1) + 100;
            System.out.printf("%3d ", A1[i]);
        }

        System.out.println("\nSum: " + sum(A1));
        System.out.println("Ave: " + ave(A1));
        System.out.println("Max: " + max(A1));
        System.out.println("Min: " + min(A1));
    }

    public static int sum(int [] temp){
        int total = 0;
        for (int i = 0; i < temp.length; i++)
            total += temp[i];
        return total;
    }

    public static double ave(int [] temp){
        return (double) sum(temp) / 20;
    }

    public static int max(int [] temp){
        int max = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max)
                max = temp[i];
        }
        return max;
    }

    public static int min(int [] temp){
        int min = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] < min)
                min = temp[i];
        }
        return min;
    }
}
