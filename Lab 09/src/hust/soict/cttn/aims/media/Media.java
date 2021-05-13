package hust.soict.cttn.aims.media;

 public abstract class Media implements Comparable{
	protected String title;
	protected String category;
	protected String director;
	protected String author;
	protected String artist;
	protected String url;
	protected float cost;
	protected int length;
	protected int id;
	protected int nums = 0;
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
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(!(obj instanceof Media))
			return false;
		else {
			Media newMedia = (Media) obj;
			return newMedia.getId() == this.id;
		}
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if(this.nums == ((Media) obj).getNums()) {
			return this.length - ((Media) obj).getLength();
		}
		else {
			return (this.nums - ((Media) obj).getNums())*100;
		}
	}
	
	public String getUrl() {
		return this.url;
	}
	public abstract void setCategory(String category);
	public abstract void setTitle(String title);
	public abstract void setCost(float cost);
	public abstract void setLength(int lenght);
	public abstract void setId(int id);
	public abstract void setNums(int nums);
	public abstract void setUrl(String url);
}
