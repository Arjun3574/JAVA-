class people {
    String name;

    people(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

public class oop {
    public static void main(String[] args) {
        people p = new people("Arjun");
        p.sayHello();
    }
}
