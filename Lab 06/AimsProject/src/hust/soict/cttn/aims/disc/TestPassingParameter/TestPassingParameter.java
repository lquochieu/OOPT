package hust.soict.cttn.aims.disc.TestPassingParameter;
import hust.soict.cttn.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungLe = new DigitalVideoDisc("JungLe");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("CinderellaDVD");
		
		swap(jungLe, cinderellaDVD);
		System.out.println("Jungle dvd title: " + jungLe.getTitle());
		System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungLe, cinderellaDVD.getTitle());
		System.out.println("Jungle dvd title: " + jungLe.getTitle());
	}
	
	public static  void  swap(Object o1, Object o2) 
	{
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
