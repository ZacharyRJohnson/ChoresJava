package Model;

public class Chore {
    private int due_date;   /* Date the chore must be done. Format Month Day Year.
                             Example: May 10th 2018 = 05102018 */
    private int time;       // Time chore is to be done
    private String repeat;
    private String name;
    private String owner;

    public Chore(int date, int time, String repeat, String name, String owner) {
        this.due_date = date;
        this.time = time;
        this.repeat = repeat;
        this.name = name;
        this.owner = owner;
    }

    public int getDue_date() {
        return due_date;
    }

    public void setDue_date(int due_date) {
        this.due_date = due_date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
