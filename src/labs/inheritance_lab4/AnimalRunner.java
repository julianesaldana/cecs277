package labs.inheritance_lab4;

import java.util.*;
public class AnimalRunner{
    public static void main(String[] args){
        ArrayList <Speakable> dogcatList = new ArrayList<>();
        dogcatList.add(new Dog("Fred"));
        dogcatList.add(new Cat("Wanda"));
        for (Speakable obj : dogcatList) {  // changed object to Speakable because it's a speakable object
            obj.speak();
        }
    }
}