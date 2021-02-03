package Inheritance;

class Human {
    public void Talk() {
        System.out.println("Talk");
    }

    public void Eat() {
        System.out.println("Eat");
    }

    public void Walk() {
        System.out.println("Walk");
    }
}

class Student1 extends Human {
}

class Researcher1 extends Human {
}

class Professor1 extends Human {
}

public class Inheritance2 {
    public static void main(String[] args) {
        Student1 student = new Student1();
        Researcher1 researcher = new Researcher1();
        Professor1 professor = new Professor1();

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
