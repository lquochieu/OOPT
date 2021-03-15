import javax.swing.JOptionPane;

public class CaculateTwoNumbers {
    public static void main(String[] args) {
        String stra, strb;
        JOptionPane.showMessageDialog(null, "Enter a and b: ", "Caculate", JOptionPane.INFORMATION_MESSAGE);
        stra = JOptionPane.showInputDialog(null, "Enter a");
        strb = JOptionPane.showInputDialog(null, "Enter b");
        double a, b;
        a = Double.parseDouble(stra);
        b = Double.parseDouble(strb);
        if(b != 0) {
        JOptionPane
                .showMessageDialog(null,
                        "Sum a and b: " + (a + b) + "\n" + "Difference a to b: " + (a - b) + "\n" + "Product a and b: "
                                + (a * b) + "\n" + "Quotient a gives b: " + a / b,
                        "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Sum a and b: " + (a + b) + "\n" + "Difference a to b: " + (a - b) + "\n" + "Product a and b: "
            + (a * b) + "\n" + "Unspecified quotient!", "Result!!", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}
