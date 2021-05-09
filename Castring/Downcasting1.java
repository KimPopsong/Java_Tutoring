package Castring;

class Person1{
    String name;
    int age;

    public Person1(String name){
        this.name = name;
    }
}

class Student1 extends Person1{  // 부모클래스 -> 슈퍼클래스, student의 부모클래스는 person, student의 슈퍼클래스는 person
    String grade;

    public Student1(String name){
        super(name);
    }
}

public class Downcasting1 {
    public static void main(String[] args) {
        Person1 person1 = new Student1("Park");  // Upcasting
        person1.age = 100;
        //person1.grade = "A"  // Error

        Student1 student1;
        student1 = (Student1)person1;  // Downcasting
        student1.grade = "C";

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.grade);
    }
}
