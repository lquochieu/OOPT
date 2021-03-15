
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
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getDate() {
		Date = day + " " + month + " " + years;
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
}
