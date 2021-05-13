package hust.soict.cttn.aims.media;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.cttn.aims.PlayerException;

public class Track implements Playable, Comparable{
	private String title;
	private int length;
	
	public void play() throws PlayerException{
		if(this.getLength() > 0) {
			JFrame demoPlay = new JFrame();
			JLabel displayLabel1 = new JLabel();
			displayLabel1.setText("Playing Disc: " + title );
			JLabel displayLabel2 = new JLabel("Disc length: " + length);
			JPanel demoPlayPanel = new JPanel();
			demoPlayPanel.setLayout(new BoxLayout(demoPlayPanel, BoxLayout.Y_AXIS));
			demoPlayPanel.add(displayLabel1);
			demoPlayPanel.add(displayLabel2);
			demoPlay.add(demoPlayPanel, BorderLayout.CENTER);
			demoPlay.setPreferredSize(new Dimension(500, 500));
			demoPlay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			demoPlay.pack();
			demoPlay.setVisible(true);
			System.out.println("Playing disc: " + this.getTitle());
			System.out.println("Disc length: " + this.getLength());
		} else {
			throw new PlayerException("ERROR: DVD length is non-postitive");
		}
		
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
