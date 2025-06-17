public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        int product = a * b;
        double quotient = (double) a / b; // Cast to double for accurate division
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    
}
