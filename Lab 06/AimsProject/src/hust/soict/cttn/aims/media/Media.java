package hust.soict.cttn.aims.media;

public class Media {
	private String title;
	private String category;
	private String director;
	private float cost;
	private int length;
	public String getDirector() {
		return director;
	}
	public void setDirectory(String director) {
		this.director = director;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	Media(String title){
		this.title = title;
		}
	Media(String title, String category){
		this(title);
		this.category = category;
		}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCatagory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
