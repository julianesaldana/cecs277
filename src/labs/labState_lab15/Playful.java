package labs.labState_lab15;

public class Playful implements State {
    public void sleep() {
        Cat.setAction(" goes to sleep");
        Cat.setState(new Asleep());
    }

    public void eat() {
        Cat.setAction(" eats");
        Cat.setState(new Playful());
    }

    public void play() {
        Cat.setAction(" is already playing");
    }

    public void ignore() {
        Cat.setAction(" ignores you");
    }
}