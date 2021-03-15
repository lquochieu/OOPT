import javax.swing.JOptionPane;
public class Exercise_1_update_1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change the first class?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "You'vs chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
        System.exit(0);
    }
}
