package school;

import java.util.ArrayList;
import java.util.List;
import school.model.Grade;
import school.model.Person;
import school.model.Student;
import school.model.Teacher;
import school.utils.DateUtils;
import school.utils.GradeUtils;
import school.utils.NameUtils;

public class Main{
    public static void main(String[] args) {
         System.out.println("=== Шаг 1 ===\n");
        
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

        System.out.println("=== Шаг 2 ===\n");

         String[] rawNames = {"  ivan petrov  ", "MARIA SMIRNOVA", "aLeKsAnDr aLeKsAnDrOv"};
        
        for (String raw : rawNames) {
            String formatted = NameUtils.formatFullName(raw);
            String shortName = NameUtils.getShortName(raw);
            System.out.println("Raw: \"" + raw + "\"");
            System.out.println("Formatted: \"" + formatted + "\"");
            System.out.println("Short: \"" + shortName + "\"");
            System.out.println();
        }
        
        // Валидация имен
        System.out.println("Name Validation:");
        String[] testNames = {"Ivan Petrov", "I", "Ivan123", "Анна-Мария", "О'Коннор"};
        
        for (var name : testNames) {
            boolean valid = NameUtils.isValidName(name);
            System.out.println("\"" + name + "\" is valid: " + valid);
        }
        
        System.out.println("\nDate Formatting:");
        String testDate = "2025-01-15";
        System.out.println("Raw: \"" + testDate + "\"");
        System.out.println("Formatted: \"" + DateUtils.formatDate(testDate) + "\"");
        System.out.println("Valid: " + DateUtils.isValidDate(testDate));
        
        System.out.println("\nDate Validation:");
        String[] testDates = {"2025-01-15", "15-01-2025", "2025/01/15", "2025-13-01"};
        
        for (String date : testDates) {
            boolean valid = DateUtils.isValidDate(date);
            System.out.println("\"" + date + "\" is valid: " + valid);
        }
        
        System.out.println("\nGrade Description:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Grade " + i + ": " + GradeUtils.getGradeDescription(i));
        }
        
        // Демонстрация работы с обновленными классами
        try {
            System.out.println("\nCreating objects with validation:");
            school.model.Student student = new school.model.Student(1, "  john doe  ", "10A");
            System.out.println("Student created: " + student.getFullName());
            
            school.model.Grade grade = new school.model.Grade(1, 1, "Math", 5, "2025-01-15");
            System.out.println("Grade created: " + grade.getValue());
            
            // Попытка создать объект с невалидными данными
            // school.model.Student invalidStudent = new school.model.Student(2, "Jo", "10A"); // Выбросит исключение
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}