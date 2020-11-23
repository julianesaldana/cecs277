package programs.memento_prog6;

import java.math.BigInteger;

public class main_prog6 {
    public static void main(String[] arg) {
        long start, end;
        double duration;
        BigInteger f; // changed this to BigInteger

        for (int i = 0; i < 1000; i++) {
            start = System.currentTimeMillis();
            BigInteger temp = new BigInteger(String.valueOf(i));
            f = fibo(temp);
            end = System.currentTimeMillis();
            duration = (end - start) / 1000.0;
            System.out.printf("Fibo(%d): %12d (Secs: %5.3f)\n", i, f, duration);
        }

        //testing out memento, originator, caretaker
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        //end of test, will need to look at how to apply this to fibo function
    }

    public static BigInteger fibo(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else
            return fibo(n.subtract(BigInteger.ONE)).add(fibo(n.subtract(BigInteger.TWO)));
    }
}
