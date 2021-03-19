import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = a.nextInt();
        int i, j;
        for (i = 0; i < n; ++i) {
            String str = "";
            for (j = 1; j <= 2 * n - 1; ++j) {
                if (j >= n - i && j <= n + i) {
                    str += "*";
                } else {
                    str += " ";
                }
            }
            System.out.println(str);
        }
        System.exit(0);
    }
}
