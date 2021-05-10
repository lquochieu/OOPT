package hust.soict.cttn.aims.order.Order;

import hust.soict.cttn.aims.media.DigitalVideoDisc;
import hust.soict.cttn.aims.media.Media;
import hust.soict.cttn.aims.ultils.MyDate.MyDate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;



public class Order {
	
	private static final int MAX_NUMBERS_ORDERED = 10;
	private float cos = 0;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private boolean lucky = false;
	Random generator = new Random();
	
	public void clear() {
		itemsOrdered.clear();
	}
	public void getLuckyItem() {
		if(itemsOrdered.size() > 0) {
		int a = generator.nextInt(itemsOrdered.size());
		DigitalVideoDisc dvd = new DigitalVideoDisc(itemsOrdered.get(a).getTitle());
		dvd.setCategory(itemsOrdered.get(a).getCategory());
		dvd.setDirector(itemsOrdered.get(a).getDirector());
		dvd.setLength(itemsOrdered.get(a).getLength());
		dvd.setCost(0);
		itemsOrdered.remove(a);
		itemsOrdered.add(a, dvd);
		System.out.println("Disc " + itemsOrdered.get(a).getTitle() + " free!");
		}
	}
	public boolean NextNumbersItemOrders() {
		if(itemsOrdered.size()>= MAX_NUMBERS_ORDERED) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean NextNumbersItemOrders(int nums) {
		if(itemsOrdered.size()+ nums> MAX_NUMBERS_ORDERED) {
			return false;
		}
		else {
			return true;
		}
	}
	public void clearMedia() {
		itemsOrdered.clear();
	}
	public void addMedia(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (this.itemsOrdered.size() + 2> MAX_NUMBERS_ORDERED) {
			JOptionPane.showMessageDialog(null, "Full order. Can't add disc!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		} else {
			this.itemsOrdered.add(dvd1);
			this.itemsOrdered.add(dvd2);
		}
	}

	public void addMedia(Media media) {
		if (this.itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			this.itemsOrdered.add(media);
		} else {
			JOptionPane.showMessageDialog(null, "Full order. Can't add item!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void removeMedia(Media media) {
		for(int i = 0; i < itemsOrdered.size(); ++i) {
			if(media.getTitle().equals(itemsOrdered.get(i).getTitle())) {
				this.itemsOrdered.remove(i);
				break;
			}
		}
		
	}
	public void removeMedia(Media media, int nums) {
		for(int i = 0; i < itemsOrdered.size(); ++i) {
			if(media.getTitle().equals(itemsOrdered.get(i).getTitle()) && nums > 0) {
				this.itemsOrdered.remove(i);
				nums--;
			}
			if(nums <= 0) {
				break;
			}
		}
		
	}

	public float totalCost() {
		for (int j = 0; j < itemsOrdered.size(); ++j) {
			cos += itemsOrdered.get(j).getCost();
		}
		return cos;
	}

	
	
}



	

