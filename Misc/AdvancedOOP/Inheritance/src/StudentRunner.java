package Misc.AdvancedOOP.Inheritance.src;

public class StudentRunner {
    
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Student1");
        student.setEmail("student1@gmail.com");
        
        Person person = new Person();
        person.setName("Student1");
        person.setEmail("student1@gmail.com");
        person.setPhoneNumber("123-456-7890");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
    }
}