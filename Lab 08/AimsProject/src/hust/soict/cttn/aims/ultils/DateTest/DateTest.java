package hust.soict.cttn.aims.ultils.DateTest;
import java.util.LinkedList;


import hust.soict.cttn.aims.media.DigitalVideoDisc;
import hust.soict.cttn.aims.ultils.MyDate.MyDate;

public class DateTest {
    public static final int MAX_NUM = 1000;
	private int num = 0;
    String[] status = new String[MAX_NUM];
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
    public int check_remove(MyDate date1, MyDate date2)
   	{
   		//Date1 is date bought disc, date2 is date removed disc
   		if ((date1.getYear_index() - date2.getYear_index()) * 400
   		+ (date1.getMonth_index() - date2.getMonth_index()) * 31 + date1.getDay_index()
   		- date2.getDay_index() >= 0) {
   			return 1;
   		} else {
   			return 0;
   		}
   	}
    

    public void date_order(LinkedList<MyDate> date) {
		System.out.println("***********     List of orders     **********");
		System.out.println("*********************************************");
		for(int i = 0; i < date.size(); ++i) {
			System.out.println("|Date: " + date.get(i).getDate());
			if(date.get(i).getDisk() != null) {
				System.out.println("|Ordered Items: " + date.get(i).getDisk().getTitle());
				System.out.println("|Cost: " + date.get(i).getDisk().getCost() + "$");
				
			}
			if(date.get(i).getBook() != null) {
				System.out.println("|Ordered Items: " + date.get(i).getBook().getTitle());
				System.out.println("|Cost: " + date.get(i).getBook().getCost() + "$");
			}
			if(date.get(i).getCompactDisc() != null) {
				System.out.println("|Ordered Items: " + date.get(i).getCompactDisc().getTitle());
				System.out.println("|Cost: " + date.get(i).getCompactDisc().getCost() + "$");
			}
			System.out.println("|Quanity: " + date.get(i).getNums());
			System.out.println("|Status: " + date.get(i).getStatus());
			System.out.println();	
		}
	}
	public int checkYears(MyDate date) {
		year_index = date.getYear_index();
        if (year_index  % 4 != 0) {
            return 0;
        } else {
            if (year_index % 100 == 0 && year_index % 400 != 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

	public int checkMonth(MyDate date) {
		month_index = date.getMonth_index();
        if(month_index != 0) {
        	return 1;
        }
        else return 0;
    }

	 public int checkDay(MyDate date) {
		 day_index = date.getDay_index();
		 if (day_index == 0) {
			 return 0;
		 }
	                if (day_index >= 32) {
	                    return 0;
	                }
	                if (day_index == 31) {
	                    if (month_index != 1 || month_index != 3 || month_index != 5 || month_index != 7 || month_index != 8
	                            || month_index != 10 || month_index != 12) {
	                        return 0;
	                    }
	                }
	                if (day_index == 30) {
	                    if (month_index == 2) {
	                        return 0;
	                    }
	                }
	                if (day_index == 29) {
	                    if (checkYears(date) == 1) {
	                        if (month_index != 2) {
	                            return 0;
	                        }
	                    }
	                }
	                return 1;
	    }
	 
}
