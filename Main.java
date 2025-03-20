import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size + 2]; 

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        
        System.out.print("Enter begin: ");
        int begin = sc.nextInt();
        for (int i = size; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = begin;
        size++;

        
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        numbers[size] = end;
        size++;

       
        System.out.print("New array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
