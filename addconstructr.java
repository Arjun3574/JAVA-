public class addconstructr {
    int a;
    int b;
    int sum;

    addconstructr(int num1, int num2) {
        a = num1;
        b = num2;
        sum = a + b;
    }

    void display() {
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        addconstructr obj = new addconstructr(10, 20);
        obj.display();
    }
}
