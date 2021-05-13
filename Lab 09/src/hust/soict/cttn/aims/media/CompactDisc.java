package hust.soict.cttn.aims.media;

import java.util.ArrayList;
import java.util.Iterator;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	ArrayList<Track> tracks = new ArrayList<Track>();
	Track track;
	public CompactDisc(String title) {
		super(title);
		this.title = title;
		// TODO Auto-generated constructor stub
	}
	
	public void play() {
			java.util.Iterator iter = tracks.iterator();
			while(iter.hasNext()) {
				Track track = (Track) iter.next();
				track.play();
			}
	}
	
	public boolean checkTracks() {
		for(int i = 0; i < tracks.size(); ++i) {
			if(tracks.get(i).getTitle().equals(this.title)) {
				return true;
			}
		}
		return false;
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
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public void setTrack(Track track) {
		this.track = track;
	}

	public String getArtist() {
		return artist;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}
	

}
