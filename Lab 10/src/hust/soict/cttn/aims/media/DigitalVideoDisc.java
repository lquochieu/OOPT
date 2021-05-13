package hust.soict.cttn.aims.media;

import java.util.ArrayList;
import java.util.Random;

import hust.soict.cttn.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable, Comparable{
	
	ArrayList<Track> tracks = new ArrayList<Track>();
	Track track;

	public void play() throws PlayerException {
		if(this.getLength() > 0) {
			java.util.Iterator iter = tracks.iterator();
			Track nexTrack;
			while(iter.hasNext()) {
				nexTrack = (Track) iter.next();
				try {
					nexTrack.play();
				} catch (Exception e) {
					throw e;
				}
			}
		} else {
			throw new PlayerException("ERROR: DVD length is non-postitive");
		}
	}
	public void addTrack() {
		track = new Track(title, length);
		boolean a = false;
		for(int i = 0; i < tracks.size(); ++i) {
			if(this.title.equals(tracks.get(i).getTitle())) {
				a = true;
			}
		}
		if(!a) {
			tracks.add(track);
		}
	}
	public void removeTrack() {
		for(int i = 0; i < tracks.size(); ++i) {
			if(tracks.get(i).getTitle().equals(this.title)) {
				tracks.remove(i);
				break;
			}
		}
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public void setTrack(Track track) {
		this.track = track;
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
	
	
}
