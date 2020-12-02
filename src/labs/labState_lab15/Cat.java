public class Cat {
  private static State state;
  private static String action;
  private String name;
  public Cat(String name){
    state = new Hungry();
    action = " is doing nothing";
    this.name = name;
  }

  public static void setState(State s) {
    state = s;
  }

  public static State getState(){
    return state;
  }

  public static void setAction(String str){
    action = str;
  }

  public static String getAction(){
    return action;
  }

  public void sleep(){
    state.sleep();
  }
  public void eat(){
    state.eat();
  }

  public void play(){
    state.play();
  }
  public void ignore(){
    state.ignore();
  }

  public String toString(){
    return name + action;
  }
}