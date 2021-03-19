import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	int qtyOrder = 0;
	float cos = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public void addDigitalVideoDisc(LinkedList<DigitalVideoDisc> list) {
		if (list.size() > MAX_NUMBERS_ORDERED) {
			System.out.println("Full order! Can't add disc!");
		} else {
			for (int i = 0; i < list.size(); ++i) {
				this.itemsOrdered[i] = list.get(i);
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if(qtyOrder > MAX_NUMBERS_ORDERED)
		{
			System.out.println("Full order! Can't add disc!");
		}
		else
		{
			
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrder < MAX_NUMBERS_ORDERED) {
			qtyOrder++;
		} else {
			JOptionPane.showMessageDialog(null, "Full order. Can't add disc!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		qtyOrder--;
	}

	public float totalCost() {
		for (int j = 1; j <= qtyOrder; ++j) {
			cos += itemsOrdered[j - 1].getCost();
		}
		return cos;
	}
}
