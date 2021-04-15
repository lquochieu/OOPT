package hust.soict.cttn.aims.media;

public class Disc extends Media {
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		this.title = title;
	}

	@Override
	public void setCategory(String category) {
		// TODO Auto-generated method stub
		this.category = category;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	@Override
	public void setCost(float cost) {
		// TODO Auto-generated method stub
		this.cost = cost;
	}

	@Override
	public void setLength(int lenght) {
		// TODO Auto-generated method stub
		this.length = lenght;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public void setNums(int nums) {
		// TODO Auto-generated method stub
		this.nums = nums;
		if(this.nums < 0) {
			this.nums = 0;
		}
	}
	public boolean search(String title) {
		String[] spaceStrings = title.split(" ");
		String[] tt = this.title.trim().split(" ");
		int b = 0; //b check title, b = 1 while spaceStrings[i] exist in title
		if(spaceStrings.length > tt.length) return false;
		else {
		for(int i = 0; i < spaceStrings.length; ++i) {
			int a = spaceStrings[i].length();
			b = 0;
			for(int j = 0; j < tt.length; ++j) {
				if(spaceStrings[i].equals(tt[j])) {
					tt[j] = ""; 
					b = 1;
					break;
				}
			}
			if(b == 0 ) {
				return false;
			}
		}
		}
		if(b == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
