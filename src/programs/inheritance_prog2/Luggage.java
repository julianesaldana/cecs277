package programs.inheritance_prog2;

public abstract class Luggage implements Comparable<Luggage>{
    protected float volume;
    protected String type;

    public Luggage(float v, String t){
        this.volume = v;
        this.type = t;
    }

    @Override
    public int compareTo(Luggage that){
        if (this.volume > that.volume)
            return 1;
        if (this.volume < that.volume)
            return -1;
        return 0;
    }
}
