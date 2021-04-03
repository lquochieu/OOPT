package hust.soict.cttn.aims.ultils.DateUltils;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import hust.soict.cttn.aims.media.DigitalVideoDisc;
import hust.soict.cttn.aims.ultils.MyDate.MyDate;

public class DateUltils {
    public void compareTwoDate(MyDate date1, MyDate date2) {
        if (date1.getYear_index() > date2.getYear_index()) {
            JOptionPane.showMessageDialog(null, "Product 2nd bought after product 1st", "Compare two date!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (date1.getYear_index() < date2.getYear_index()) {
            JOptionPane.showMessageDialog(null, "Disc 1st bought after disc 2nd", "Compare two date!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (date1.getMonth_index() > date2.getMonth_index()) {
                JOptionPane.showMessageDialog(null, "Disc 2nd bought after disc 1st", "Compare two date!",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (date1.getMonth_index() < date2.getMonth_index()) {
                JOptionPane.showMessageDialog(null, "Disc 1st bought after Disc 2nd", "Compare two date!",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                if (date1.getDay_index() > date2.getDay_index()) {
                    JOptionPane.showMessageDialog(null, "Disc 2nd bought after Disc 1st", "Compare two date!",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (date1.getDay_index() < date2.getDay_index()) {
                    JOptionPane.showMessageDialog(null, "Disc 1st bought after Disc 2nd", "Compare two date!",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Two disc bought the same time.", "Compare two date!",
                            JOptionPane.INFORMATION_MESSAGE);

                }
            }
        }
    }

    public int compare(MyDate date1, MyDate date2) {
        if ((date1.getYear_index() - date2.getYear_index()) * 400
                + (date1.getMonth_index() - date2.getMonth_index()) * 31 + date1.getDay_index()
                - date2.getDay_index() > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void sortingDate(LinkedList<MyDate> date) {
        for (int i = 0; i < date.size(); ++i) {
            for (int j = i + 1; j < date.size(); ++j) {
                if (compare(date.get(j - 1), date.get(j)) == 1) {
                    date.add(j - 1, date.get(j));
                    date.remove(j + 1);
                }
            }
            
        }
    }
}
