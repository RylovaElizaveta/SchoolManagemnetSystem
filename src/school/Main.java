package school;

import java.util.ArrayList;
import java.util.List;
import school.model.Grade;
import school.model.Person;
import school.model.Student;
import school.model.Teacher;

public class Main{
    public static void main(String[] args) {
         System.out.println("=== Шаг 1: Базовые классы ===\n");
        
        // Создание студентов
        Student student1 = new Student(1, "Ivan Petrov", "10A");
        Student student2 = new Student(2, "Maria Smirnova", "11B");
        
        // Создание учителей
        Teacher teacher1 = new Teacher(101, "Aleksandr Aleksandrov", "Mathematics");
        Teacher teacher2 = new Teacher(102, "Elena Volkova", "Russian Literature");


        Grade grade1 = new Grade(1, 1, "Mathematics", 5, "2025-01-10");
        Grade grade2 = new Grade(2, 1, "Mathematics", 4, "2025-01-15");

        System.out.println("Students:");
        System.out.println(student1);
        System.out.println(student2);
        
        System.out.println("\nTeachers:");
        System.out.println(teacher1);
        System.out.println(teacher2);
        
        System.out.println("\nGrades:");
        System.out.println(grade1);
        System.out.println(grade2);

        student1.setGroup("11A");
        System.out.println("\nAfter changes:" + student1.getGroup());
        
        System.out.println("All people Polymorphism");
        List<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(student2);
        personList.add(teacher1);
        personList.add(teacher2);

        for (Person p : personList){
             System.out.println(p);
        }



    }
}