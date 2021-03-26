package hust.soict.cttn.aims.ultils.DateTest;
import java.util.LinkedList;

import hust.soict.cttn.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.cttn.aims.ultils.MyDate.MyDate;

public class DateTest {
    public static final int MAX_NUM = 1000;
	private int num = 0;
    String[] status = new String[MAX_NUM];
    public int check_remove(MyDate date1, MyDate date2)
   	{
   		//Date1 is date bought disc, date2 is date removed disc
   		if ((date1.getYear_index() - date2.getYear_index()) * 365
   		+ (date1.getMonth_index() - date2.getMonth_index()) * 30 + date1.getDay_index()
   		- date2.getDay_index() > 0) {
   			return 1;
   		} else {
   			return 0;
   		}
   	}
    
	public void addHistory(LinkedList<MyDate> date, LinkedList<DigitalVideoDisc>[] list)  {
		for(int i = 0; i < date.size(); ++i) {
			for(int j = 0; j < list[i].size(); ++j) {
				if(list[i].get(j).getStatus() == 0) {
					status[num] = list[i].get(j).getTitle() + " was deleted on " + date.get(i).getDate() + "\n";
					}
				else {
					if(list[i].get(j).getStatus() == 1) {
    					status[num] = list[i].get(j).getTitle() + " was purchased on " + date.get(i).getDate() + "\n";
    					}
					}
				num ++;
			}
		}
	}
	public void checkHistory() {
		for(int k = 0; k < num; ++k)
		{
				System.out.println(status[k]);
		}
	}
	public int checkYears(MyDate date) {
    }

	public int checkMonth(MyDate date) {
    }

    public int checkDay(MyDate date) {
    }
}
