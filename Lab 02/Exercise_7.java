import java.util.Scanner;
public class Exercise_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the numbers of rows and colums");
        System.out.println("The number of rows: ");
        m = input.nextInt(); 
        System.out.println("The numbr of colums: ");
        n = input.nextInt();
        Double arr[][] = new Double[m][n];
        Double brr[][] = new Double[m][n];
        System.out.println("Enter the value of each element in the matrix A!");
        for(int i = 0; i < m; ++i)
        {
            System.out.printf("Enter the value of each element in row[%d]: ", i);
            for(int j = 0; j < n; ++j)
            {
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter the value of each element in the matrix B!");
        for(int i = 0; i < m; ++i)
        {
            System.out.printf("Enter the value of each element in row[%d]: ", i);
            for(int j = 0; j < n; ++j)
            {
                brr[i][j] = input.nextDouble();
            }
        }
        System.out.println("The sum of the matrix A and matrix B is:");
        for(int i = 0; i < m; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                System.out.printf("%f ", arr[i][j] + brr[i][j]);
            }
            System.out.println("");
        }
        System.exit(0);
    }
}
