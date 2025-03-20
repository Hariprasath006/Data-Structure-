import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size + 2]; // Increased size by 2 to accommodate new elements

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Insert at the beginning
        System.out.print("Enter begin: ");
        int begin = sc.nextInt();
        for (int i = size; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = begin;
        size++;

        // Insert at the end
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        numbers[size] = end;
        size++;

        // Print new array
        System.out.print("New array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
