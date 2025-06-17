public class arrbuldin {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        // Using built-in functions from java.util.Arrays
        java.util.Arrays.sort(numbers); // Sort the array
        int index = java.util.Arrays.binarySearch(numbers, 7); // Search for value 7
        int[] copy = java.util.Arrays.copyOf(numbers, numbers.length); // Copy the array

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Index of 7: " + index);
        System.out.print("Copied array: ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = java.util.Arrays.stream(numbers).min().getAsInt();
        int max = java.util.Arrays.stream(numbers).max().getAsInt();
        double avg = java.util.Arrays.stream(numbers).average().getAsDouble();
        int sum = java.util.Arrays.stream(numbers).sum();
        long count = java.util.Arrays.stream(numbers).count();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }
}
