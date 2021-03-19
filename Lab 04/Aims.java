import java.awt.List;
import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Aims {
	 
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param <string>
	 * @param args
	 */

	@SuppressWarnings("unchecked")
	public static <string> void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		DateTest check = new DateTest();
		LinkedList<DigitalVideoDisc> list = new LinkedList<DigitalVideoDisc>();

		String day, month, years;
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		list.add(dvd1);
		
		
		
		MyDate date1 = new MyDate();
		String a = dvd1.getTitle();
		date1.setDay(a, 1);
		date1.setMonth(a, 1);
		date1.setYears(a, 1);
		check.addHistory(date1.getDate(), dvd1.getTitle(), 1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		list.add(dvd2);
		
		MyDate date2 = new MyDate();
	    a = dvd2.getTitle();
		date2.setDay(a, 1);
		date2.setMonth(a, 1);
		date2.setYears(a, 1);
		check.addHistory(date2.getDate(), dvd2.getTitle(), 1);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd1);
		list.add(dvd3);
		
		MyDate date3 = new MyDate();
		a = dvd3.getTitle();
		date3.setDay(a, 1);
		date3.setMonth(a, 1);
		date3.setYears(a, 1);
		check.addHistory(date3.getDate(), dvd3.getTitle(), 1);

		anOrder.removeDigitalVideoDisc(dvd2);
		list.remove(1);
		MyDate date4 = new MyDate();
		a = dvd2.getTitle();
		date4.setDay(a, 0);
		date4.setMonth(a, 0);
		date4.setYears(a, 0);
		check.addHistory(date4.getDate(), dvd2.getTitle(), 0);
		
		anOrder.addDigitalVideoDisc(list);
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost() + "\n");
		check.checkHistory();
		System.exit(0);
	}
}
