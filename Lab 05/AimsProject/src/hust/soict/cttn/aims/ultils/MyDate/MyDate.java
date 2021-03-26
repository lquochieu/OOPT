package hust.soict.cttn.aims.ultils.MyDate;
import javax.swing.JOptionPane;



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
	private String title;
	
	public void set(String title) {
		this.title = title;
	}
	public  String getTitle() {
		return title;
	}

	public String getDay() {

		return this.day;
	}

	public void setDay(int a) {
		if (a == 1) {
			this.day = JOptionPane.showInputDialog(null, "Enter day",
					"You are bought disk.\nPlease enter the date the item was ordered!",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.day = JOptionPane.showInputDialog(null, "Enter day",
					"You are remove disk.\nPlease enter the date of order deletion!",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(int a) {
		if (a == 1) {
			this.month = JOptionPane.showInputDialog(null, "Enter month",
					"You are bought disk.\nPlease enter the date the item was ordered!",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.month = JOptionPane.showInputDialog(null, "Enter month",
					"You are bought disk.\nPlease enter the date of order deletion!",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public String getYears() {
		return years;
	}

	public void setYears(int a) {
		if (a == 0) {
			this.years = JOptionPane.showInputDialog(null, "Enter years",
					"You are bought disk.\nPlease enter the date the item was ordered!",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.years = JOptionPane.showInputDialog(null, "Enter years",
					"You are bought disk.\nPlease enter the date of order deletion!",
					JOptionPane.INFORMATION_MESSAGE);
		}
		this.year_index = Double.parseDouble(this.years); 
	}
	public String getDate() {
		Date = month + " " + day + " " + years;
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	public double getYear_index() {
		return year_index;
	}
	public int getMonth_index() {
		return month_index;
	}

	public int getDay_index() {
		return day_index;
	}
	public int checkYears() {
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

	public int checkMonth() {
        for (int i = 0; i < 12; ++i) {
            if (month.equals(a[i]) || month.equals(c[i]) || month.equals(d[i]) || month.equals(s[i])) {
            	month = c[i];
                return 1;
            }
      
        }
		return 0;
    }

    public int checkDay() {
        for (int i = 0; i < 31; ++i) {
            if (day.equals(e[i]) || day.equals(f[i])) {
                day_index = i + 1;
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
                    if (checkYears() == 1) {
                        if (month_index != 2) {
                            return 0;
                        }
                    }
                }
                day = f[i];
                return 1;
            }
           System.out.print("1");
        }
		return 0;
    }
   

}
