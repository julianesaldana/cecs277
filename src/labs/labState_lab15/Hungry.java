public class Hungry implements State {

  public void sleep(){
    Cat.setAction(" goes to sleep, hungry");
    Cat.setState(new Asleep());
  }
  public void eat(){
    Cat.setAction(" is playful after eating");
    Cat.setState(new Playful());
  }

  public void play(){
   Cat.setAction(" is too hungry to play");
  }

  public void ignore(){
    Cat.setAction(" ignores you");
  }
}