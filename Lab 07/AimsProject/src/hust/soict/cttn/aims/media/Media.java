package hust.soict.cttn.aims.media;

 public abstract class Media {
	protected String title;
	protected String category;
	protected String director;
	protected String author;
	protected String artist;
	protected float cost;
	protected int length;
	protected int id;
	protected int nums;
	
	public int getId() {
		return id;
	}
	public String getDirector() {
		return director;
	}
	Media(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	Media(String title, String category){
		this(title);
		this.category = category;
		}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public int getNums() {
		return nums;
	}
	public float getCost() {
		return cost;
	}
	public int getLength() {
		return length;
	}
	public abstract void setCategory(String category);
	public abstract void setTitle(String title);
	public abstract void setCost(float cost);
	public abstract void setLength(int lenght);
	public abstract void setId(int id);
	public abstract void setNums(int nums);
}
