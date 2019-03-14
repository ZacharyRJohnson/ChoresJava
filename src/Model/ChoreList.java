package Model;


import java.util.ArrayList;
import java.util.List;

public class ChoreList {
    private List<Chore> chores;

    public ChoreList() {
        chores = new ArrayList<Chore>();
    }

    public List<Chore> getChores() {
        return chores;
    }

    public void addChore(Chore chore) {
        chores.add(chore);
    }


}
