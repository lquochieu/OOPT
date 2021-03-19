import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] a = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        int[] b = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] c = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December" };
        String[] d = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec." };
        String[] s = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        String month;
        int u, ml, years;
        u = 1;
        ml = 0;
        while (u != 0) {
            System.out.println("Enter month: ");
            month = x.nextLine();
            for (int i = 0; i < 12; ++i) {
                if (month.equals(a[i]) || month.equals(c[i]) || month.equals(d[i]) || month.equals(s[i])) {
                    ml = i + 1;
                    u = 0;
                }
            }

            if (u != 0) {
                System.out.println("Error. Please enter again!");
            }
        }
        ;
        System.out.println("Enter year: ");
        years = x.nextInt();
        if (ml != 2) {
            System.out.println(c[ml - 1] + " " + years + " has " + b[ml - 1] + " days!");
        } else {
            if (years % 4 != 0) {
                System.out.println(c[ml - 1] + " " + years + " has " + b[ml - 1] + " days!");
            } else {
                if (years % 100 == 0 && years % 400 != 0) {
                    System.out.println(c[ml - 1] + " " + years + " has " + b[ml - 1] + " days!");
                } else {
                    System.out.println(c[ml - 1] + " " + years + " has " + (b[ml - 1] + 1) + " days!");
                }
            }
        }
    }
}
