import java.util.Scanner;

public class ok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        if(s == "1")
        {
            System.out.println("ok");
        }
        else
        {
            System.out.println("Oh, no!");
        }
    }
}