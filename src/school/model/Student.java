package school.model;

public class Student extends Person{
    private String group;

    public Student(int id, String fullName, String group) {
        super(fullName, id);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
    @Override
    public String getRole() {
        return "Student";  
    }

    @Override
    public String toString() {
        return String.format("Person(id=%d, fullName='%s', role='%s', group='%s')", getId(), getFullName(), getRole(), group);
    }

    



    
    
}