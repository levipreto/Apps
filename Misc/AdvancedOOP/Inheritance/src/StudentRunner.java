package Misc.AdvancedOOP.Inheritance.src;

public class StudentRunner {
    
    public static void main(String[] args) {
        Student student = new Student("Chris", "USP College");
        //student.setName("Student1");
        student.setEmail("student1@gmail.com");
        
        /*
        Person person = new Person();
        person.setName("Student1");
        person.setEmail("student1@gmail.com");
        person.setPhoneNumber("123-456-7890");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
        */

        Employee employee = new Employee("Chris", "Analyst");
        //employee.setName("Student1");
        employee.setEmail("student1@gmail.com");
        employee.setPhoneNumber("123-456-7890");
        employee.setEmployeeGrade('A');
        employee.setTitle("Analyst");
        System.out.println(employee);
    }
}