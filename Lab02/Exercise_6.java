import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num;
        System.out.println("Enter the number of element in the array!");
        n = input.nextInt();
        Double arr[] = new Double[n];
        System.out.println("Enter the value of each element in the array.");
        for (int i = 0; i < n; ++i) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextDouble();
        }
        Double a, s;
        s = 0.0;
        a = 0.0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[i]) {
                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            s += arr[i];
        }
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.printf("\nThe average value of array element: %f", s/n);
        System.exit(0);
    }
}
