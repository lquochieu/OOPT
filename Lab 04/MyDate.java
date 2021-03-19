import javax.swing.JOptionPane;
public class MyDate {
	private String day, month, years;
	private String Date;
	private int Nums;

	public int getNums() {
		return Nums;
	}

	public void setNums(int nums) {
		Nums = nums;
	}

	public String getDay() {

		return this.day;
	}

	public void setDay(String title, int a) {
		if (a == 1) {
			this.day = JOptionPane.showInputDialog(null, "Enter day",
					"You are bought disk " + title + ".\nPlease enter the date the item was ordered!",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.day = JOptionPane.showInputDialog(null, "Enter day",
					"You are remove disk " + a + ".\nPlease enter the date of order deletion!",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String title, int a) {
		if (a == 1) {
			this.month = JOptionPane.showInputDialog(null, "Enter month",
					"You are bought disk " + title + ".\nPlease enter the date the item was ordered!",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.month = JOptionPane.showInputDialog(null, "Enter month",
					"You are bought disk " + a + ".\nPlease enter the date of order deletion!",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public String getYears() {
		return years;
	}

	public void setYears(String title, int a) {
		if (a == 0) {
			this.years = JOptionPane.showInputDialog(null, "Enter years",
					"You are bought disk " + title + ".\nPlease enter the date the item was ordered!",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.years = JOptionPane.showInputDialog(null, "Enter years",
					"You are bought disk " + a + ".\nPlease enter the date of order deletion!",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public String getDate() {
		Date = day + " " + month + " " + years;
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

}
