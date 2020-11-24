package programs.memento_prog6.originalFiles;

public class OriginatorRD {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public MementoRD saveStateToMemento(){
        return new MementoRD(state);
    }

    public void getStateFromMemento(MementoRD memento){
        state = memento.getState();
    }
}
