public class Asleep implements State{
  public void sleep(){
   Cat.setAction(" is already sleeping");
  }
  public void eat(){
    Cat.setAction(" wakes up to eat");
    Cat.setState(new Playful());
  }

  public void play(){
    Cat.setAction(" is too sleepy to play");
  }

  public void ignore(){
    Cat.setAction(" ignores you to sleep");
  }
}