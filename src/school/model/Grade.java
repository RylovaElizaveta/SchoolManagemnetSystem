package school.model;

import school.utils.DateUtils;
import school.utils.GradeUtils;

public class Grade{
    private int id;
    private int studentId;
    private String subject;
    private int value;
    private String date;

    public Grade(int id, int studentId, String subject, int value, String date) {
  
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
         // Валидация оценки
        if (!GradeUtils.isValidGradeValue(value)) {
            throw new IllegalArgumentException("Invalid grade value: " + value);
        }
        this.value = value;
        
        // Валидация даты
        if (!DateUtils.isValidDate(date)) {
            throw new IllegalArgumentException("Invalid date format: " + date);
        }
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Grade{id=%d, studentId=%d, subject='%s', value=%d, date='%s'}", id, studentId, subject, value, date);
    }

    

}