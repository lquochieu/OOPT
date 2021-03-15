
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	int qtyOrder = 0;
	float cos = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if(qtyOrder < MAX_NUMBERS_ORDERED) {
		this.itemsOrdered[qtyOrder] = new DigitalVideoDisc(dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
		qtyOrder +=1;
		}
		else {
			System.out.println("Full order. Can't add disc");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		qtyOrder--;
		itemsOrdered[qtyOrder] = null;
	}
	public float totalCost() {
		for(int j = 1; j <= qtyOrder; ++j) {
			cos += itemsOrdered[j-1].getCost();
		}
		return cos;
	}
}
