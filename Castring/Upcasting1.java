package Castring;

class Person{
    String name;
    int age;

    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    String grade;

    public Student(String name){
        super(name);
    }
}

public class Upcasting1 {
    public static void main(String[] args) {
        Person person;
        Student student = new Student("Kim");  //student -> name = "Kim"
        person = student;  // Upcasting

        student.grade = "A";
        student.age = 20;

        //System.out.println(person.grade);  // Error
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
