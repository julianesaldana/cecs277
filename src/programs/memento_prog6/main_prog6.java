package programs.memento_prog6;

import java.math.BigInteger;

public class main_prog6 {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        long start, end;
        double dur;
        BigInteger f;
        BigInteger i = BigInteger.ZERO;
        while (i.compareTo(BigInteger.valueOf(1001)) < 0) {
            start = System.nanoTime();
            f = fibo(i, careTaker);
            originator.setState(f);
            careTaker.add(originator.saveStateToMemento());
            end = System.nanoTime();
            dur = (end - start);
            System.out.printf("Fibo(%d): %12d (NanoSecs: %5.3f)\n", i, f, dur);
            i = i.add(BigInteger.ONE);
        }
    }

    public static BigInteger fibo(BigInteger n, CareTaker careTaker) {
        if (careTaker.size() < 2) {
            if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
                return BigInteger.ONE;
            else
                return fibo(n.subtract(BigInteger.ONE), careTaker).add(fibo(n.subtract(BigInteger.TWO), careTaker));
        } else {
            return careTaker.get(careTaker.size() - 1).getState().add(careTaker.get(careTaker.size() - 2).getState());
        }
    }
}
