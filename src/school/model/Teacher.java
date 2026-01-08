package school.model;

public class Teacher extends Person{
    private String subject;

    public Teacher(int id, String fullName, String subject) {
        super(fullName, id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public String getRole() {
        return "Teacher";  
    }

    @Override
    public String toString() {
        return String.format("Person(id=%d, fullName='%s', role='%s', subject='%s')", getId(), getFullName(), getRole(), subject);
    }
    
}