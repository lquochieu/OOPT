package hust.soict.cttn.aims.media;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Track implements Playable, Comparable{
	private String title;
	private int length;
	private String url;
	private String playDisk ="";

	public void play() {
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
		System.out.println("Playing Disc: " + this.getTitle());
		System.out.println("Disc length: " + this.getLength());
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
