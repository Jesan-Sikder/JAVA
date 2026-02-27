import java.util.Scanner;

public class arr_even {
    public static void main(String[] args) {
        System.out.printf("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}