package programs.memento_prog6.originalFiles;

import java.util.ArrayList;
import java.util.List;

public class CareTakerRD {
    private List<MementoRD> mementoListRD = new ArrayList<MementoRD>();

    public void add(MementoRD state){
        mementoListRD.add(state);
    }

    public MementoRD get(int index){
        return mementoListRD.get(index);
    }
}
