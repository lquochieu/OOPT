import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = keyBoard.nextLine();
        System.out.println("How old are you?");
        int age = keyBoard.nextInt();
        System.out.println("How tall are you (m)?");
        double tall = keyBoard.nextDouble();
        System.out.println("Mr/Mrs. " + name + ", " + age + " years old. " + "You heigt is " + tall +" m.");
        System.exit(0);
    }
}
