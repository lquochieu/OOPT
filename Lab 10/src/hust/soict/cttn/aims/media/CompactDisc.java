package hust.soict.cttn.aims.media;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import hust.soict.cttn.aims.PlayerException;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	ArrayList<Track> tracks = new ArrayList<Track>();
	Track track;
	public CompactDisc(String title) {
		super(title);
		this.title = title;
		// TODO Auto-generated constructor stub
	}
	LinkedList<String> playCD = new LinkedList<String>();	
	JFrame playFrame = new JFrame();

	boolean checkPlay = false;
	public void play() throws PlayerException {
		if(!checkPlay) {
			if(this.getLength() > 0) {
				java.util.Iterator iter = tracks.iterator();
				Track nexTrack = null;
				while(iter.hasNext()) {
					nexTrack = (Track) iter.next();
					try {
						nexTrack.play();
						playCD.add(nexTrack.getPlayDisk());
					} catch (Exception e) {
						throw e;
					}
				}
				checkPlay = true;
				JTextArea playTxt = new JTextArea();
				JScrollPane textScrollPane = new JScrollPane(playTxt);
				for(int i = 0; i < playCD.size(); ++i) {
					playTxt.setText(playTxt.getText() + playCD.get(i) + " \n\n");
				}
				playFrame.add(textScrollPane);
				playFrame.setPreferredSize(new Dimension(650, 600));
				playFrame.pack();
				
			} else {
				throw new PlayerException("ERROR: DVD length is non-postitive");
			}
		}
	}
	public void startPlay() {
		playFrame.setVisible(true);
	}
	public boolean checkTracks() {
		for(int i = 0; i < tracks.size(); ++i) {
			if(tracks.get(i).getTitle().equals(this.title)) {
				return true;
			}
		}
		return false;
	}
	public void addTrack(String title, int length) {
		track = new Track(title, length);
		boolean a = false;
		for(int i = 0; i < tracks.size(); ++i) {
			if(title.equals(tracks.get(i).getTitle())) {
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
