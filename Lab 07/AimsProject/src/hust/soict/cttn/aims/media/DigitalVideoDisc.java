package hust.soict.cttn.aims.media;

import java.util.ArrayList;
import java.util.Random;

public class DigitalVideoDisc extends Disc implements Playable, Comparable{
	ArrayList<Track> tracks = new ArrayList<Track>();
	Track track;
	
	public void play() {
		java.util.Iterator iter = tracks.iterator();
		while(iter.hasNext()) {
			Track track = (Track) iter.next();
			track.play();
		}
	}
	
	
	public void setDirector(String directory) {
		this.director = directory;
	}
	public DigitalVideoDisc(String title) {
		super(title);
		this.title =title;
	}
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super(title);
		this.title = title;
		this.category = category;
		this.director = directory;
		this.length = length;
		this.cost = cost;
	}
	
	public void addTrack() {
		track = new Track(title, length);
		tracks.add(track);
	}
	public void removeTrack() {
		for(int i = 0; i < tracks.size(); ++i) {
			if(tracks.get(i).getTitle().equals(this.title)) {
				tracks.remove(i);
				break;
			}
		}
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public void setTrack(Track track) {
		this.track = track;
	}
}
