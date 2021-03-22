import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	int qtyOrder = 0;
	float cos = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public void addDigitalVideoDisc(LinkedList<DigitalVideoDisc> list) {
		if (list.size() > MAX_NUMBERS_ORDERED) {
			JOptionPane.showMessageDialog(null, "Full order. Can't add disc!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		} else {
			for (int i = 0; i < list.size(); ++i) {
				this.itemsOrdered[i] = list.get(i);
			}
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrder > MAX_NUMBERS_ORDERED - 1) {
			JOptionPane.showMessageDialog(null, "Full order. Can't add disc!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		} else {

			this.itemsOrdered[qtyOrder] = new DigitalVideoDisc(dvd1.getTitle(), dvd1.getCategory(), dvd1.getDirector(),
					dvd1.getLength(), dvd1.getCost());
			this.itemsOrdered[qtyOrder + 1] = new DigitalVideoDisc(dvd2.getTitle(), dvd2.getCategory(), dvd2.getDirector(),
					dvd2.getLength(), dvd2.getCost());
			qtyOrder++;
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (qtyOrder < MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[qtyOrder] = new DigitalVideoDisc(dvd.getTitle(), dvd.getCategory(), dvd.getDirector(),
					dvd.getLength(), dvd.getCost());
			qtyOrder += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Full order. Can't add disc!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		qtyOrder--;
		itemsOrdered[qtyOrder] = null;
	}

	public float totalCost() {
		for (int j = 1; j <= qtyOrder; ++j) {
			cos += itemsOrdered[j - 1].getCost();
		}
		return cos;
	}
}
