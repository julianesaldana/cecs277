package programs.inheritance_prog2;


import java.util.ArrayList;

public class shippingContainer {
    private ArrayList<Luggage> container;

    public shippingContainer(){
        container = new ArrayList<Luggage>();
        container.add(new Box(1,2,3));
        container.add(new Sphere(1));
        container.add(new Cone(1,2));
        container.add(new Cylinder(1,2));
        container.add(new Prism(1,2));
        container.add(new Pyramid(1,2));
        container.add(new Tetrahedron(1));
        container.add(new Cube(1));
        container.add(new Box(2,3,4));
        container.add(new Cube(2));
        sort();
    }

    public void display(){
        for (int i = 0; i < container.size(); i++){
            System.out.println((i+1) + ". " + container.get(i));
        }
        System.out.println();
    }

    public void add(Luggage lug){
        container.add(lug);
        sort();
    }

    public void remove(int choice){
        container.remove(choice);
    }

    public void sort(){
        container.sort(Luggage::compareTo);
    }

    public float getTotalVolume(){
        float volume = 0;
        for (Luggage lug : container){
            volume += lug.volume;
        }
        return volume;
    }

    public int getSize(){
        int total = 0;
        for (Luggage lug : container)
            total += 1;
        return total;
    }
}
