import java.util.Scanner;
public class Aims {
	 static int accept(int a) {
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to record the date of your purchase? Y/N \n");
		String x;
		x = input.nextLine();
		if(x.equals("Y") || x.equals("y")) {
			a = 1;
		}
		return a;
		
	}
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		DateTest check = new DateTest();
		int a = 0;
		int x = accept(a);
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		
		MyDate date1 = new MyDate();
		if(x == 1) {
			date1.setNums(1);
			date1.setDay("18th");
			date1.setMonth("February");
			date1.setYears("2019");
			check.addHistory(date1.getDate(), dvd1.getTitle(), 1, dvd1.getCost());
		}
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		MyDate date2 = new MyDate();
		if(x == 1) {
			date2.setNums(1);
			date2.setDay("18th");
			date2.setMonth("February");
			date2.setYears("2019");
			check.addHistory(date2.getDate(), dvd2.getTitle(), 1, dvd2.getCost());
		}
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		MyDate date3 = new MyDate();
		if(x == 1) {
			date3.setNums(1);
			date3.setDay("19th");
			date3.setMonth("February");
			date3.setYears("2019");
			check.addHistory(date3.getDate(), dvd3.getTitle(), 1, dvd3.getCost());
		}
		anOrder.removeDigitalVideoDisc(dvd2);
		
		MyDate date4 = new MyDate();
		if(x == 1) {
			date4.setNums(1);
			date4.setDay("18th");
			date4.setMonth("February");
			date4.setYears("2019");
			check.addHistory(date4.getDate(), dvd2.getTitle(), 0, dvd2.getCost());
		}
		
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost() + "\n");
		check.checkHistory();
		System.exit(0);
	}
}
