
public class DateTest {
    public static final int MAX_NUM = 1000;
	int i = 0;
    String[] status = new String[MAX_NUM];
	public void addHistory(String Date, String Disk, int a) {
		if(a == 0) {
            status[i] = Disk + " was deleted on " + Date + "\n";
        }
        else {
            status[i] = Disk + " was purchased on " + Date + "\n";
        }
        i++;
	}
	public void checkHistory() {
		for(int k = 0; k <i; ++k)
		{
				System.out.println(status[k]);
		}
	}
}
