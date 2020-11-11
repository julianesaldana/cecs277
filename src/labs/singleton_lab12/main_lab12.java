// Lab #12
// Lab Members
// Josiah Rojas
// Julian Saldana
// Scott Herron
// Angel Cueva
// Time submitted - 4:15 PST

package labs.singleton_lab12;

public class main_lab12 {
    public static void main(String[]arg){
        MathLibrary mathOne = MathLibrary.getInstance();
        MathLibrary mathTwo = MathLibrary.getInstance();

        System.out.println(mathOne.toString());
        System.out.println(mathOne.someMathMethod());
        System.out.println(mathOne.anotherMathMethod());

        System.out.println();

        System.out.println(mathTwo.toString());
        System.out.println(mathTwo.someMathMethod());
        System.out.println(mathTwo.anotherMathMethod());
    }
}
