package hust.soict.cttn.aims.ultils.MyDate;
import java.util.Scanner;

import javax.swing.JOptionPane;

import hust.soict.cttn.aims.media.Book;
import hust.soict.cttn.aims.media.CompactDisc;
import hust.soict.cttn.aims.media.DigitalVideoDisc;



public class MyDate {
	private final String[] a = { "jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    private final int[] b = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final String[] c = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
    private final String[] d = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.",
            "Dec." };
    private final String[] s = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
    private final String[] e = { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th",
            "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th",
            "25th", "26th", "27th", "28th", "29th", "30th", "31st" };
    private final String[] f = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    int month_index, day_index;
    double year_index;
    boolean y;
	private String day, month, years;
	private String Date;
	private int status;
	private DigitalVideoDisc disc;
	private int nums;
	private Scanner input;
	private Book book;
	private CompactDisc cd;
	public int getNums() {
		return nums;
	}

	public void setCompactDisc(CompactDisc cd, int nums) {
		this.cd = cd;
		this.nums = nums;
		
	}
	public CompactDisc getCompactDisc() {
		return this.cd;
	}
	public void setBook(Book book, int nums) {
		this.book = book;
		this.nums = nums;
		
	}
	public Book getBook() {
		return this.book;
	}
	public DigitalVideoDisc getDisk() {
		return this.disc;
	}
	public void setDisk(DigitalVideoDisc disc, int nums) {
		this.disc = disc;
		this.nums = nums;
	}
	
	public void setStatus(int a) {
		status = a;
	}
	
	public String getStatus() {
		if(status == 1) {
			return "bought";
		}
		else {
			return "remove";
		}
	}
	
	public String getDay() {

		return this.day;
	}

	public void setDay(int a) {
		if (a == 1) {
			System.out.print("Enter day: ");
			input = new Scanner(System.in);
			this.day = input.next();
		} else {
			System.out.print("Enter day: ");
			input = new Scanner(System.in);
			this.day = input.next();
		}
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(int a) {
		if (a == 1) {
			System.out.print("Enter month: ");
			input = new Scanner(System.in);
			this.month = input.next();
		} else {
			System.out.print("Enter month: ");
			input = new Scanner(System.in);
			this.month = input.next();
		}
	}

	public String getYears() {
		return years;
	}

	public void setYears(int a) {
		if (a == 0) {
			System.out.print("Enter years: ");
			input = new Scanner(System.in);
			this.years = input.next();
		} else {
			System.out.print("Enter years: ");
			input = new Scanner(System.in);
			this.years = input.next();
		}
		
	}
	public String getDate() {
		Date = month + " " + day + " " + years;
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

   
    public double getYear_index() {
    	year_index = Double.parseDouble(years); 
		return year_index;
	}
	public int getMonth_index() {
		for (int i = 0; i < 12; ++i) {
            if (month.equals(a[i]) || month.equals(c[i]) || month.equals(d[i]) || month.equals(s[i])) {
            	month = c[i];
            	month_index = i + 1;
                return month_index;
            }
      
        }
		return month_index;
	}

	public int getDay_index() {
		 for (int i = 0; i < 31; ++i) {
	            if (day.equals(e[i]) || day.equals(f[i])) {
	                day_index = i + 1;
	                return day_index;
	            }
		 }
		return day_index;
	}

	


	
}
