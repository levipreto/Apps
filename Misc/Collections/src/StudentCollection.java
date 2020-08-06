package Misc.Collections.src;

public class StudentCollection implements Comparable<StudentCollection> {

    private int id;
    private String name;

    public StudentCollection(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(StudentCollection that) {
        return Integer.compare(this.id, that.id); //ascending order
        //return Integer.compare(that.id, this.id); //descending order
    }
}