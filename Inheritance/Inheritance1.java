package Inheritance;

class Student {
    public void Talk() {
        System.out.println("Student Talk");
    }

    public void Eat() {
        System.out.println("Student Eat");
    }

    public void Walk() {
        System.out.println("Student Walk");
    }
}

class Researcher {
    public void Talk() {
        System.out.println("Researcher Talk");
    }

    public void Eat() {
        System.out.println("Researcher Eat");
    }

    public void Walk() {
        System.out.println("Researcher Walk");
    }
}

class Professor {
    public void Talk() {
        System.out.println("Professor Talk");
    }

    public void Eat() {
        System.out.println("Professor Eat");
    }

    public void Walk() {
        System.out.println("Professor Walk");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Student student = new Student();
        Researcher researcher = new Researcher();
        Professor professor = new Professor();

        student.Talk();
        researcher.Talk();
        professor.Talk();

        student.Eat();
        researcher.Eat();
        professor.Eat();

        student.Walk();
        researcher.Walk();
        professor.Walk();
    }
}
