package hust.soict.cttn.aims.media;

import java.util.ArrayList;

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
			System.out.println("Playing DVD: " + track.getTitle());
			System.out.println("DVD length: " + track.getLength());
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

	public String getArtist() {
		return artist;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

}
