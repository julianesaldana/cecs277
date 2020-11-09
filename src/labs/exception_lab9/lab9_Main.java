package labs.exception_lab9;
import java.util.*;

public class lab9_Main {
    public static void main(String[]arg){
        try{
            Scanner in = new Scanner(System.in);
            int [] numbers = {1,2,3};
            int a = 7;
            int b = 0;
            int maxInt = Integer.MAX_VALUE;
            Integer c = 5;
            String d = "String";

            arithExcept(a, 1);
            System.out.println(indexOutBounds(numbers, 2));
            System.out.println(nullPointer(c));
            inMismatch(in);
            classCast(d);
            System.out.println(add(a, maxInt));
        }
        catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }
        catch(NullPointerException e){
            System.out.println("Cannot access value because it is null.");
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        catch (ClassCastException e){
            System.out.println("Object cannot be casted");
        }
        catch (OverflowException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Some Other Exception");
            System.out.println(e);
        }
    }

    public static int arithExcept(int a, int b){
        return a / b;
    }

    public static int indexOutBounds(int [] arr, int a){
        return arr[a];
    }

    public static int nullPointer(Integer x){
        return x;
    }

    public static int inMismatch(Scanner input){
        int x = input.nextInt();
        return x;
    }

    public static String classCast(Object x){
        return (String) x;
    }

    public static int add(int x, int y) throws OverflowException{
        long test = (long) x + (long) y;
        if(test > Integer.MAX_VALUE || test < Integer.MIN_VALUE){
            throw new OverflowException("Overflow detected");
        }
        return x + y;
    }
}

class OverflowException extends Exception{
    public OverflowException (String errorMessage){
        super(errorMessage);

    }
}




