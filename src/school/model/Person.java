package school.model;

public abstract class Person{
    private int id;
    private String fullName;

    public Person(String fullName, int id) {
        this.fullName = fullName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return String.format("Person{id=" + id + ", fullName='" + fullName + "', role='%s'", getRole());
    }
}