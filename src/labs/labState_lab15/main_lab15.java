//Brian Vu
//Ruben Cervantes
//Devin Elmore
//Julian S.
//Demo: 5:35 PM

package labs.labState_lab15;

public class main_lab15 {
    public static void main(String[] args) {
        Cat typicalCat = new Cat("Fluffy");

        // should print out "NAME is doing nothing"
        System.out.println(typicalCat);


        typicalCat.sleep();
        typicalCat.play();

        System.out.println(typicalCat);

        typicalCat.eat();
        typicalCat.play();
        typicalCat.eat();
        typicalCat.sleep();

        System.out.println(typicalCat);
    }
}