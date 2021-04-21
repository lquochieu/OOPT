package hust.soict.cttn.aims.media;


public class Track implements Playable, Comparable{
	private String title;
	private int length;
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
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
		if(!(obj instanceof CompactDisc))
			return 0;
		else {
			Track newTrack = (Track) obj;
			if(newTrack.getTitle() == this.title) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
}
