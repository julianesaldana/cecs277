package labs;
import java.util.ArrayList;

public class arrayListStats_lab2 {
    // insert all the functions here
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    public static double ave(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer i : list) {
            if (list.get(i) >= max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer i : list) {
            if (list.get(i) <= min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static void display(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public static int mode(ArrayList<Integer> list) {
        int mode = 0;
        int highest_occurrences = 1;

        for (int num : list) {
            int temp_highest = 1;
            for (int num2 : list) {
                if (num == num2)
                    temp_highest++;
                if (temp_highest >= highest_occurrences){
                    if (temp_highest > highest_occurrences) {
                        highest_occurrences = temp_highest;
                        mode = num;
                    }
                    else{
                        if (num2 < num)
                            mode = num2;
                    }
                }
            }
        }
        return mode;

// first version using collections
//        Collections.sort(list);
//        int mode = 0;
//        int highest_occurrences = 0;
//
//        for (int num : list) {
//            int temp_highest = 1;
//            for (int num2 : list) {
//                if (num == num2)
//                    temp_highest++;
//                if (temp_highest > highest_occurrences) {
//                    highest_occurrences = temp_highest;
//                    mode = num;
//                }
//            }
//        }
//        return mode;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

//        for (int i = 0; i < 1000; i++) {
//            int num = (int) (100 + (Math.random() * 400 + 1));
//            numbers.add(num);
//        }

        numbers.add(2);
        numbers.add(2);
        numbers.add(1);
        numbers.add(1);

        System.out.println("Print the list of numbers here");
        display(numbers);
        double ave = ave(numbers);
        int max = max(numbers);
        int min = min(numbers);
        int sum = sum(numbers);
        int mode = mode(numbers);
        System.out.println("\nAve:" + ave);
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Sum:" + sum);
        System.out.println("Mode:" + mode);
    }
}