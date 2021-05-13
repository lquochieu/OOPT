package hust.soict.cttn.aims.media;


public class Track implements Playable, Comparable{
	private String title;
	private int length;
	
	public void play() {
		System.out.println("Playing Disc: " + this.getTitle());
		System.out.println("Disc length: " + this.getLength());
		}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(!(obj instanceof Track))
			return false;
		else {
			Media newMedia = (Media) obj;
			return (newMedia.getLength() == this.length) && (newMedia.getTitle() == this.title);
		}
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		
			Track newTrack = (Track) obj;
			return this.getTitle().compareTo(newTrack.getTitle());
	}
}
