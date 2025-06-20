class Person {
    void walk() {
        System.out.println("Person is walking");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

public class SingleInheritance1 {
    public static void main(String[] args) {
        // Create object of parent class
        Person p = new Person();
        p.walk();
        // Create object of child class
        Student s = new Student();
        s.study();
        s.walk();
    }
}
