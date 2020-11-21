package programs.memento_prog6;

public class main_prog6 {
    public static void main(String[]arg){
        long start, end;
        double duration;
        int f; // change this to BigInteger

        for(int i=0; i < 1000; i++){
            start = System.currentTimeMillis();
            f = fibo(i);
            end = System.currentTimeMillis();
            duration = (end - start)/1000.0;
            System.out.printf("Fibo(%d): %12d (Secs: %5.3f)\n",i,f, duration);
        }
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }
}
