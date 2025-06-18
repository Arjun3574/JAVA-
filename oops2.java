class Student {
  
    String name;
    int age;
    int marks;


     Student(String studentName, int studentAge,int studentMarks) {
        name = studentName;
        age = studentAge;
        marks = studentMarks;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Arjun", 20, 85);
        Student s2 = new Student("Krishna", 22, 90);
        Student s3 = new Student("Kalyani", 21, 95);

        s1.display();
        System.out.println("----");
        s2.display();
        System.out.println("----");
        s3.display();
    }
}