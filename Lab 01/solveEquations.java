import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class solveEquations {
    static void equation1() {
        String stra, strb;
        DecimalFormat format = new DecimalFormat("0.#");
        stra = JOptionPane.showInputDialog(null, "Enter a");
        strb = JOptionPane.showInputDialog(null, "Enter b");
        double a = Double.parseDouble(stra), b = Double.parseDouble(strb);
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, format.format(a) + "x + " + format.format(b) + " = 0\n"
                        + "The equation has infinite solutions \n", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        format.format(a) + "x + " + format.format(b) + " = 0\n" + "The equation has no solution \n",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(
                    null, format.format(a) + "x + " + format.format(b) + " = 0\n"
                            + "The equation has the only solution: x = " + format.format(-b / a),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static void equation2() {
        String stra1, strb1, strc1, stra2, strb2, strc2;
        DecimalFormat format = new DecimalFormat("0.#");
        stra1 = JOptionPane.showInputDialog(null, "Enter a1");
        strb1 = JOptionPane.showInputDialog(null, "Enter b1");
        strc1 = JOptionPane.showInputDialog(null, "Enter c1");
        stra2 = JOptionPane.showInputDialog(null, "Enter a2");
        strb2 = JOptionPane.showInputDialog(null, "Enter b2");
        strc2 = JOptionPane.showInputDialog(null, "Enter c2");
        double a1, b1, c1, a2, b2, c2, A, B, C;
        a1 = Double.parseDouble(stra1);
        b1 = Double.parseDouble(strb1);
        c1 = Double.parseDouble(strc1);
        a2 = Double.parseDouble(stra2);
        b2 = Double.parseDouble(strb2);
        c2 = Double.parseDouble(strc2);
        A = a1 * b2 - a2 * b1;
        B = c1 * b2 - c2 * b1;
        C = a1 * c2 - a2 * c1;
        // A, B, C la cac dinh thuc
        if (A == 0) {
            if (B != 0 || C != 0) {
                JOptionPane.showMessageDialog(null,
                        format.format(a1) + "x + " + format.format(b1) + "y + " + format.format(c1) + " = 0\n" + format.format(a2)
                                + "x " + format.format(b2) + "y " + format.format(c2) + " = 0\n" + "Equations have no solution \n",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        format.format(a1) + "x + " + format.format(b1) + "y + " + format.format(c1) + " = 0\n" + format.format(a2)
                                + "x " + format.format(b2) + "y " + format.format(c2) + " = 0\n" + "Equations have infinite solutions \n",
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    format.format(a1) + "x + " + format.format(b1) + "y + " + format.format(c1) + " = 0\n" + format.format(a2) + "x + "
                            + format.format(b2) + "y + " + format.format(c2) + " = 0\n" + "Euations has the only solution:\nx = " + format.format((-B / A)) + ", y = "
                            + format.format(-C / A) + "\n",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static void equation3() {
        String stra, strb, strc;
        DecimalFormat format = new DecimalFormat("0.#");
        stra = JOptionPane.showInputDialog(null, "Enter a");
        strb = JOptionPane.showInputDialog(null, "Enter b");
        strc = JOptionPane.showInputDialog(null, "Enter c");
        double a, b, c, D;
        // D is delta
        a = Double.parseDouble(stra);
        b = Double.parseDouble(strb);
        c = Double.parseDouble(strc);
        D = b * b - 4 * a * c;
        if (D > 0) {
            JOptionPane.showMessageDialog(null,
                    format.format(a) + "x^2 + " + format.format(b) + "x + " + format.format(c) + " = 0\n"
                            + "The equation has two solutions: x1 = " + (-b - Math.sqrt(D)) / (2 * a) + ", x2 = "
                            + (-b - Math.sqrt(D)) / (2 * a) + "\n",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (D == 0) {
            JOptionPane.showMessageDialog(null,
                    format.format(a) + "x^2 + " + format.format(b) + "x + " + format.format(c) + " = 0\n"
                            + "The equation has the only solution: x = " + -b / (2 * a) + "\n",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            D = -D;
            JOptionPane.showMessageDialog(null,
                    format.format(a) + "x^2 + " + format.format(b) + "x + " + format.format(c) + " = 0\n"
                            + "The equation has two complex solutions: x1 = " + (-b) / (2 * a) + " - "
                            + (-Math.sqrt(D)) / (2 * a) + "i" + ", x2 = " + -b / (2 * a) + " + "
                            + Math.sqrt(D) / (2 * a) + "i \n",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        String[] options = { "1", "2", "3", "Exit" };
        int option2 = 1;
        JOptionPane.showMessageDialog(null, "Welcome to solve equation!", "Welcome!", JOptionPane.INFORMATION_MESSAGE);
        while (option2 == 1) {
            int opt = 1;
            int option1 = JOptionPane.showOptionDialog(null,
                    "Please select the equation you want to solve: \n"
                            + "1.The first degree equation (linear equation) with one variable\n"
                            + "2.The first degree equation (linear equation) with two variables\n"
                            + "3.The second degree equation with one variable\n" + "Enter your selection: ",
                    "Option", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[3]);
            while (option1 == 0 && opt == 1) {
                equation1();
                int x = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
                        "The first degree equation with one variable", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (x == JOptionPane.NO_OPTION) {
                    opt = 0;
                } else if (x == JOptionPane.CANCEL_OPTION) {
                    System.exit(0);
                }
            }
            ;
            while (option1 == 1 && opt == 1) {
                equation2();
                int x = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
                        "The first degree equation with two variables", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (x == JOptionPane.NO_OPTION) {
                    opt = 0;
                } else if (x == JOptionPane.CANCEL_OPTION) {
                    System.exit(0);
                }
            }
            ;
            while (option1 == 2 && opt == 1) {
                equation3();
                int x = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
                        "The second degree equation with one variable", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (x == JOptionPane.NO_OPTION) {
                    opt = 0;
                } else if (x == JOptionPane.CANCEL_OPTION) {
                    System.exit(0);
                }
            }
            ;
            if (option1 == -1 || option1 == 3) {
                int x = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "ERROR",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (x == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        }
        System.exit(0);
    }
}
