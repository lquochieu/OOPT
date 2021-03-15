import javax.swing.JOptionPane;

public class Exercise_1_update_2 {
    public static void main(String[] args) {
        String[] opt = { "I do", "I don't" };
        int option = JOptionPane.showOptionDialog(null, "Do you want to change the first class?", "Question",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == 0 ? opt[0] : opt[1]));
        System.exit(0);
    }
}
