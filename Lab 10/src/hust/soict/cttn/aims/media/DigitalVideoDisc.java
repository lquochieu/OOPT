package hust.soict.cttn.aims.media;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import hust.soict.cttn.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable, Comparable{
	
	ArrayList<Track> tracks = new ArrayList<Track>();
	Track track;
	LinkedList<String> playDVD = new LinkedList<String>();
	public void play() throws PlayerException {
		if(this.getLength() > 0) {
			java.util.Iterator iter = tracks.iterator();
			Track nexTrack = null;
			while(iter.hasNext()) {
				nexTrack = (Track) iter.next();
				try {
					nexTrack.play();
					playDVD.add(nexTrack.getPlayDisk());
				} catch (Exception e) {
					throw e;
				}
			}
		} else {
			throw new PlayerException("ERROR: DVD length is non-postitive");
		}
	}
	public void startPlay() {
		JFrame playFrame = new JFrame();
		JTextArea playTxt = new JTextArea();
		JScrollPane textScrollPane = new JScrollPane(playTxt);
		for(int i = 0; i < playDVD.size(); ++i) {
			playTxt.setText(playTxt.getText() + playDVD.get(i) + " \n\n");
		}
		playFrame.add(textScrollPane);
		playFrame.setPreferredSize(new Dimension(650, 600));
		playFrame.pack();
		playFrame.setVisible(true);
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
