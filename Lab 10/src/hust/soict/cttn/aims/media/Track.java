package hust.soict.cttn.aims.media;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.cttn.aims.PlayerException;

public class Track implements Playable, Comparable{
	private String title;
	private int length;
	private String playDisk ="";
	public void play() throws PlayerException{
		if(this.getLength() > 0) {
			playDisk += "Playing disc: " + this.getTitle() + " \nDisc length: " + this.getLength() + " minutes\n";
		} else {
			throw new PlayerException("ERROR: DVD length is non-postitive");
		}
		
		}
	public String getPlayDisk() {
		return this.playDisk;
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
