package hust.soict.cttn.aims;
import java.awt.List;
import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

import hust.soict.cttn.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.cttn.aims.order.Order.Order;
import hust.soict.cttn.aims.ultils.DateTest.DateTest;
import hust.soict.cttn.aims.ultils.DateUltils.DateUltils;
import hust.soict.cttn.aims.ultils.MyDate.MyDate;
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


	public static void main(String[] args) {
		Order anOrder = new Order();
		DateTest check = new DateTest();
		DateUltils cmp = new DateUltils();
		LinkedList<DigitalVideoDisc> lis = new LinkedList<DigitalVideoDisc>();
		LinkedList<DigitalVideoDisc>[] list = new LinkedList[10];
		LinkedList<MyDate> date = new LinkedList<MyDate>();
		for(int i = 0; i < 10; ++i) {
		list[i] = new LinkedList<DigitalVideoDisc>();
		}
		String day, month, years;
		int u;
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		dvd1.setStatus(1);
		list[0].add(dvd1);
		lis.add(dvd1);
		System.out.println("The Lion: " + dvd1.search("The Lion"));

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setStatus(1);
		lis.add(dvd2);
		list[0].add(dvd2);

		
		MyDate date1 = new MyDate();
		u = 1;
		while(u != 0) {
		date1.setDay(1);
		date1.setMonth(1);
		date1.setYears(1);
		if(date1.checkMonth() == 0 || date1.checkDay() == 0)
		{
			JOptionPane.showMessageDialog(null, "Date isn't correct.. Please enter again!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
		else {
			u = 0;
		}
		}
		date.add(date1);
		anOrder.date_order(list[0], date1, 1);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		dvd3.setStatus(1);
		lis.add(dvd3);
		list[1].add(dvd3);

		MyDate date3 = new MyDate();;
		u = 1;
		while(u != 0) {
		date3.setDay(1);
		date3.setMonth(1);
		date3.setYears(1);
		if(date3.checkMonth() == 0 || date3.checkDay() == 0)
		{
			JOptionPane.showMessageDialog(null, "Date isn't correct.. Please enter again!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
		else {
			u = 0;
		}
		}
		anOrder.date_order(list[1], date3, 1);
		date.add(date3);
		
		int rd = dvd3.getLuckyItem(lis.size());
		lis.get(rd).setCost(0);
		

		DigitalVideoDisc dvd4 = new DigitalVideoDisc(dvd2.getTitle());
		dvd4.setCost(dvd2.getCost());;
		dvd4.setStatus(0);
		list[2].add(dvd4);
		lis.remove(1);
		MyDate date4 = new MyDate();
		u = 1;
		while(u != 0) {
		date4.setDay(0);
		date4.setMonth(0);
		date4.setYears(0);
		if(date4.checkMonth() == 0 || date4.checkDay() == 0 || check.check_remove(date4, date1) == 0)
		{
			JOptionPane.showMessageDialog(null, "Date isn't correct.. Please enter again!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
		else {
			u = 0;
		}
		}
		date.add(date4);
		anOrder.date_order(list[2], date4, 0);
		cmp.sortingDate(date, list);
		
		System.out.println("Disc " + lis.get(rd).getTitle() + " free!");
		anOrder.addDigitalVideoDisc(lis);
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost() + "\n");
		check.addHistory(date, list);
		check.checkHistory();
		System.exit(0);
	}
}
