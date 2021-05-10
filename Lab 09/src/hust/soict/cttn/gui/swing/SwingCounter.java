package hust.soict.cttn.gui.swing;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import hust.soict.cttn.gui.awt.AWTCounter;

public class SwingCounter extends JFrame {
	private JLabel lblCount; 
	private JTextField tfCount; 
	private JButton btnCount; 
	private int count = 0; 
	public SwingCounter () {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		lblCount = new JLabel("Counter"); 
		cp.add(lblCount); 
		tfCount = new JTextField(count + "", 10); 
		tfCount.setEditable(false); 
		cp.add(tfCount); 
		btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				tfCount.setText(count + " ");
			}
		});
		cp.add(btnCount);
		setTitle("AWT Counter"); 
		setSize(250, 100); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SwingCounter();
			}
		});
	}
}
