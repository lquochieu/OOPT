package hust.soict.cttn.aims;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.CollationElementIterator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.sun.glass.ui.Window;
import com.sun.media.jfxmedia.Media;

import hust.soict.cttn.aims.media.Book;
import hust.soict.cttn.aims.media.CompactDisc;
import hust.soict.cttn.aims.media.DigitalVideoDisc;
import hust.soict.cttn.aims.media.TestMediaCompareTo;
import hust.soict.cttn.aims.order.Order.Order;
import hust.soict.cttn.aims.ultils.DateTest.DateTest;
import hust.soict.cttn.aims.ultils.DateUltils.DateUltils;
import hust.soict.cttn.aims.ultils.MyDate.MyDate;
import javafx.scene.layout.BorderPane;
public class Aims {
	 
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param <string>
	 * @param args
	 */


	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	
	
	static Order anOrder = new Order();
	static DateTest check = new DateTest();
	static DateUltils cmp = new DateUltils();
	static TestMediaCompareTo testMedia = new TestMediaCompareTo();
	
	static ArrayList<DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>(); // array of disks  what bought or removed the same day
	static ArrayList<Book> book = new ArrayList<Book>();
	static ArrayList<CompactDisc> cd = new ArrayList<CompactDisc>();
	static ArrayList<String> author = new ArrayList<String>();	
	
	static DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
	static DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
	static DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
	static Book b1 = new Book("You gifted, i am too");
	static Book b2 = new Book("Anohana");
	static CompactDisc cd1 = new CompactDisc("Pokemon");
	static CompactDisc cd2 = new CompactDisc("Conan");
	
	static LinkedList<MyDate> date = new LinkedList<MyDate>();
	static LinkedList<LinkedList<MyDate>> mDate = new LinkedList<LinkedList<MyDate>>();
	static LinkedList<String> labelOrder = new LinkedList<String>();
	static double cost = 0;
	static int a = 0;
	static boolean checkOrder = true;
	static MyDate date1;

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JFrame listFrame = new JFrame();
	static JPanel listPanel = new JPanel();
	
	static JPanel[] bookPanels = new JPanel[2];
	static JPanel[] cdPanels = new JPanel[2];
	static JPanel[] dvdPanels = new JPanel[3];
	static JLabel bookLabel;
	static JLabel cdLabel;
	static JLabel dvdLabel;
	static LinkedList<JPanel> listPanels = new LinkedList<JPanel>();
	static GridBagConstraints listgc = new GridBagConstraints();
	static Calendar c;
	static Date dt;
	static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");;
	
	static File fhisUser = null;
	static FileWriter fr = null;
	static BufferedWriter bfr = null;
	static BufferedReader dataUserReader = null;
	public static void main(String[] args) {
//		Thread thread = new Thread(new MemoryDaemon());
//		thread.setDaemon(true);
//		thread.start();
		
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		dvd1.setId(1000);
		dvd.add(dvd1);
		testMedia.addMedia(dvd1);
		
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(90);
		dvd2.setId(1001);
		dvd.add(dvd2);
		testMedia.addMedia(dvd2);
		
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		dvd3.setId(1002);
		dvd.add(dvd3);
		testMedia.addMedia(dvd3);
		
		b1.setCategory("Soft skill");
		b1.setCost(10f);
		author.add("Adamm Khoo");
		b1.setAuthor(author);
		b1.setLength(200);
		b1.setId(2000);
		book.add(b1);
		testMedia.addMedia(b1);
		
		b2.setCategory("Romcom");
		b2.setCost(7f);
		author.clear();
		author.add("Sinkai Makoto");
		b2.setAuthor(author);
		b2.setLength(150);
		b2.setId(2001);
		book.add(b2);
		testMedia.addMedia(b2);
		
		cd1.setCategory("Adventure");
		cd1.setCost(5f);
		cd1.setArtist("Hidenori Kusaka");
		cd1.setLength(20);
		cd1.setId(3000);
		cd.add(cd1);
		testMedia.addMedia(cd1);
		
		cd2.setCategory("Detective");
		cd2.setCost(5.5f);
		cd2.setArtist("Aoyama Gosho");
		cd2.setLength(20);
		cd2.setId(3001);
		cd.add(cd2);
		testMedia.addMedia(cd2);
		
		mDate.add(date);
		try {
			historyUser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		welcome();
	}
	
	public static void welcome() {
		JButton createButton = new JButton("Create new order");
		JButton listProductButton = new JButton("List products");
		JButton displayButton = new JButton("List items");
		JButton historyButton = new JButton("History order");
		JButton exitButton = new JButton("Exit");
		panel.setLayout(new GridLayout(6, 1));
		panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
		panel.add(createButton);
		panel.add(listProductButton);
		panel.add(displayButton);
		panel.add(historyButton);
		panel.add(exitButton);
		bookPanels[0] = new JPanel();
		bookPanels[1] = new JPanel();
		try {
			listProduct();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		createButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				createOrder();
			}
		});
		
		listProductButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkOrder) {
					listFrame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "You need create new order to start buy item", "System", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		
		displayButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(checkOrder) {
					displayProduct();
				}
				else {
					JOptionPane.showMessageDialog(null, "You need create new order to start buy item", "System", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		
		historyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				historyOrder();
			}
		});
		frame.setTitle("Order Management Application");
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension(600, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	

	public static void createOrder() {
		//after bought item and paid it
		boolean opt = true;
		if(checkOrder && date.size() > 0) {
			int x = JOptionPane.showConfirmDialog(null, "You haven't paid yet\nDo you want to continue?", "System", JOptionPane.YES_NO_OPTION);
            if(x == JOptionPane.NO_OPTION) {
            	opt = false;
            }
		}
		if(opt) {
			date = new LinkedList<MyDate>();
			book.get(0).setNums(0);
			book.get(1).setNums(0);
			cd.get(0).setNums(0);
			cd.get(1).setNums(0);
			dvd.get(0).setNums(0);
			dvd.get(1).setNums(0);
			dvd.get(2).setNums(0);
			mDate.add(date);
			anOrder.clear();
			checkOrder = true;
			try {
				listFrame = new JFrame();
				listPanel = new JPanel();
				listProduct();
				historyUser();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "A order was complete created!");
		}
		
	}
	public static void listProduct() throws IOException {
		listPanel.setLayout(new GridBagLayout());
		JPanel searchPanel = new JPanel();
		JLabel searLabel = new JLabel("Search ");
		JTextField searchTextField = new JTextField(20);
		JButton searchButton = new JButton("Enter");
		searchPanel.add(searLabel);
		searchPanel.add(searchTextField);
		searchPanel.add(searchButton);

		listgc.fill = GridBagConstraints.HORIZONTAL;
		listgc.gridwidth = 3;
		
		listgc.ipadx = 200;
		listgc.gridx = 0;
		listgc.gridy = 0;
		listFrame.add(searchPanel, BorderLayout.NORTH);
		addBook();
		addCd();
		addDvd();
		
		BufferedImage cartImng = null;
		cartImng = ImageIO.read(new File("giohang.png"));
		Image dcartImg = cartImng.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon cartImgIcon = new ImageIcon(dcartImg);
		JButton cartButton = new JButton();
		cartButton.setIcon(cartImgIcon);
		
		cartButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(checkOrder) {
					displayProduct();
				}
				else {
					JOptionPane.showMessageDialog(null, "You need create new order to start buy item", "System", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					listPanel.removeAll();
					addBook();
					addCd();
					addDvd();
					if(!searchTextField.getText().equals("")) {
						searchProduct(searchTextField.getText());
					}
					listPanel.repaint();
					listFrame.repaint();
					listFrame.pack();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JScrollPane vJScrollPane = new JScrollPane(listPanel);
		vJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		listFrame.add(vJScrollPane);
		listFrame.add(cartButton, BorderLayout.SOUTH);
		listFrame.setPreferredSize(new Dimension(1650, 825));
		listFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		listFrame.pack();
	}
	public static void addBook() throws IOException {
		
		listgc.gridx = 1;
		listgc.gridy = 0;
		bookLabel = new JLabel("Book", JLabel.CENTER);
		
		bookLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
		bookLabel.setForeground(Color.RED);
		listPanel.add(bookLabel, listgc);
		
		JLabel[] bookIcon = new JLabel[2];
		String[] bookStr = new String[2];
		BufferedImage[] imgBook = new BufferedImage[2];
		bookStr[0] = "label_item\\ImGifted.jpg";
		bookStr[1] = "anohana.jpg";
		Image[] dimgBook = new Image[2];
		ImageIcon[] imageIconBook = new ImageIcon[2];
		JTextArea[] bookTxt = new JTextArea[2];
		JButton[] addBook = new JButton[2];
		JTextField[] addBookTxt = new JTextField[2];
		JButton[] subBook = new JButton[2];
		for(int i = 0; i < book.size(); ++i) {
			bookIcon[i] = new JLabel();
			imgBook[i] = null;
			imgBook[i] = ImageIO.read(new File(bookStr[i]));
			dimgBook[i] = imgBook[i].getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			imageIconBook[i] = new ImageIcon(dimgBook[i]);
			bookIcon[i].setIcon(imageIconBook[i]);
			bookTxt[i] = new JTextArea();
			bookTxt[i].setText(book.get(i).getTitle() + "\nCategory: " + book.get(i).getCategory() + "\nAuthor: "
						+ book.get(i).getAuthor() +"\nCost: " + book.get(i).getCost() + "$\nLenght: " + book.get(i).getLength() + " pages\nId: " + book.get(i).getId());
			bookTxt[i].setEditable(false);
			listgc.gridx = 0;
			listgc.gridy =  2+ 8*i;
			listgc.gridwidth = 1;
			listgc.gridheight = 7;
			listgc.ipadx = 100;
			bookPanels[i] = new JPanel();
			bookPanels[i].setLayout(new GridBagLayout());
			bookPanels[i].setBorder(BorderFactory.createLineBorder(Color.black));
			bookPanels[i].add(bookIcon[i], listgc);

			
			listgc.ipady = 100;
			listgc.gridx = 1;
			
			bookPanels[i].add(bookTxt[i], listgc);
			
			
			bookIcon[i] = new JLabel();
			addBook[i] = new JButton("add" + (i + 1));
			addBookTxt[i] = new JTextField("0", 1);
			addBookTxt[i].setEditable(false);
			subBook[i] = new JButton("sub" +(i +1));
			listgc.ipady = 0;
			listgc.ipadx = 0;
			listgc.gridheight = 1;
			listgc.gridx = 2;
			listgc.gridy = 5 + 8*i;
			
			bookPanels[i].add(addBook[i], listgc);
			listgc.ipadx = 10;
			listgc.gridx = 3;
			listgc.gridy =5 + 8*i;
			
			bookPanels[i].add(addBookTxt[i], listgc);
			listgc.ipadx = 0;
			listgc.gridx = 4;
			listgc.gridy = 5 + 8*i;
			bookPanels[i].add(subBook[i], listgc);
			listgc.ipadx = 0;
			listgc.gridx = 1;
			listgc.gridy = 6 + 8*i;
			listPanel.add(bookPanels[i], listgc);
			
			addBook[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					for(int i = 0; i < book.size(); ++i) {
						if(e.getActionCommand().equals("add" + (i + 1))) {
							try {
								addProduct(addBookTxt[i], book.get(i));
								
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							}
					    }
				}
			});
			subBook[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for(int i = 0; i < book.size(); ++i) {
						if(e.getActionCommand().equals("sub" + (i + 1))) {
							try {
								removeProduct(addBookTxt[i], book.get(i));
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							}
					    }
				}
			});
			
		}
		listPanel.repaint();
	}
	public static void addCd() throws IOException {
		listgc.gridx =  1;
		listgc.gridy = 22;
		cdLabel = new JLabel("Compact Disc", JLabel.CENTER);
		
		cdLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
		cdLabel.setForeground(Color.RED);
		listPanel.add(cdLabel, listgc);
		JLabel[] cdIcon = new JLabel[2];
		String[] cdStr = new String[2];
		BufferedImage[] imgcd = new BufferedImage[2];
		cdStr[0] = "label_item\\pokemon.png";
		cdStr[1] = "label_item\\conan.jpg";
		Image[] dimgcd = new Image[2];
		ImageIcon[] imageIconcd = new ImageIcon[2];
		JTextArea[] cdTxt = new JTextArea[2];
		JButton[] addcd = new JButton[2];
		JTextField[] addcdTxt = new JTextField[2];
		JButton[] subcd = new JButton[2];
		JButton[] playcd = new JButton[2];
		String playStr = "label_item\\playButton.png";
		for(int i = 0; i < cd.size(); ++i) {
			cdIcon[i] = new JLabel();
			imgcd[i] = null;
			imgcd[i] = ImageIO.read(new File(cdStr[i]));
			dimgcd[i] = imgcd[i].getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			imageIconcd[i] = new ImageIcon(dimgcd[i]);
			cdIcon[i].setIcon(imageIconcd[i]);
			cdTxt[i] = new JTextArea();
			cdTxt[i].setText(cd.get(i).getTitle() + "\nCategory: " + cd.get(i).getCategory() + "\nAuthor: "
						+ cd.get(i).getArtist() +"\nCost: " + cd.get(i).getCost() + "$\nLenght: " + cd.get(i).getLength() + " pages\nId: " + cd.get(i).getId());
			cdTxt[i].setEditable(false);
			listgc.gridx = 0;
			listgc.gridy =  24 + 8*i;
			listgc.gridwidth = 1;
			listgc.gridheight = 7;
			listgc.ipadx = 100;
			
			cdPanels[i] = new JPanel();
			cdPanels[i].setLayout(new GridBagLayout());
			cdPanels[i].setBorder(BorderFactory.createLineBorder(Color.GREEN));
			
			cdPanels[i].add(cdIcon[i], listgc);
			
			listgc.ipady = 100;
			listgc.gridx = 1;
			
			cdPanels[i].add(cdTxt[i], listgc);
			
			cdIcon[i] = new JLabel();
			addcd[i] = new JButton("add" + (i + 1));
			addcdTxt[i] = new JTextField("0", 1);
			addcdTxt[i].setEditable(false);
			subcd[i] = new JButton("sub" +(i +1));
			
			imgcd[i] = ImageIO.read(new File(playStr));
			dimgcd[i] = imgcd[i].getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			imageIconcd[i] = new ImageIcon(dimgcd[i]);
			playcd[i] = new JButton("cd " + (i+1));
			playcd[i].setIcon(imageIconcd[i]);
			
			listgc.ipady = 0;
			listgc.ipadx = 0;
			listgc.gridheight = 1;
			listgc.gridx = 2;
			listgc.gridy = 27 + 8*i;
			cdPanels[i].add(addcd[i], listgc);
			
			listgc.ipadx = 10;
			listgc.gridx = 3;
			listgc.gridy =27 + 8*i;
			cdPanels[i].add(addcdTxt[i], listgc);
			
			listgc.ipadx = 0;
			listgc.gridx = 4;
			listgc.gridy = 27 + 8*i;
			cdPanels[i].add(subcd[i], listgc);
			
			listgc.ipadx = 0;
			listgc.gridx = 5;
			listgc.gridy = 27 + 8*i;
			cdPanels[i].add(playcd[i], listgc);
			
			listgc.ipadx = 0;
			listgc.gridx = 1;
			listgc.gridy = 27 + 8*i;
			listPanel.add(cdPanels[i], listgc);
			addcd[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					for(int i = 0; i < cd.size(); ++i) {
						if(e.getActionCommand().equals("add" + (i + 1))) {
							try {
								addProduct(addcdTxt[i], cd.get(i));
								
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							}
					    }
				}
			});
			subcd[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for(int i = 0; i < cd.size(); ++i) {
						if(e.getActionCommand().equals("sub" + (i + 1))) {
							try {
								removeProduct(addcdTxt[i], cd.get(i));
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							}
					    }
				}
			});
			playcd[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for(int i = 0; i < cd.size(); ++ i) {
						if(e.getActionCommand().equals("cd " + (i+1))) {
							try {
								DemoDisplay(cdStr[i], cd.get(i));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					
				}
			});
			
		}
		listPanel.repaint();		
				
	}
	public static void addDvd() throws IOException {
		listgc.gridx =  1;
		listgc.gridy = 45;
		dvdLabel = new JLabel("Digital Video Disc", JLabel.CENTER);
		
		dvdLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
		dvdLabel.setForeground(Color.RED);
		listPanel.add(dvdLabel, listgc);
		JLabel[] dvdIcon = new JLabel[3];
		String[] dvdStr = new String[3];
		BufferedImage[] imgdvd = new BufferedImage[3];
		dvdStr[0] = "label_item\\lion.jpg";
		dvdStr[1] = "label_item\\star_war.jpg";
		dvdStr[2] = "label_item\\aladin.jpg";
		Image[] dimgdvd = new Image[3];
		ImageIcon[] imageIcondvd = new ImageIcon[3];
		JTextArea[] dvdTxt = new JTextArea[3];
		JButton[] adddvd = new JButton[3];
		JTextField[] adddvdTxt = new JTextField[3];
		JButton[] subdvd = new JButton[3];
		JButton[] playdvd = new JButton[3];
		String playStr = "label_item\\playButton.png";
		for(int i = 0; i < dvd.size(); ++i) {
			dvdIcon[i] = new JLabel();
			imgdvd[i] = null;
			imgdvd[i] = ImageIO.read(new File(dvdStr[i]));
			dimgdvd[i] = imgdvd[i].getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			imageIcondvd[i] = new ImageIcon(dimgdvd[i]);
			dvdIcon[i].setIcon(imageIcondvd[i]);
			dvdTxt[i] = new JTextArea();
			dvdTxt[i].setText(dvd.get(i).getTitle() + "\nCategory: " + dvd.get(i).getCategory() + "\nAuthor: "
						+ dvd.get(i).getDirector() +"\nCost: " + dvd.get(i).getCost() + "$\nLenght: " + dvd.get(i).getLength() + " pages\nId: " + dvd.get(i).getId());
			dvdTxt[i].setEditable(false);
			
			listgc.gridx = 0;
			listgc.gridy =  46+ 8*i;
			listgc.gridwidth = 1;
			listgc.gridheight = 7;
			listgc.ipadx = 100;
			
			dvdPanels[i] = new JPanel();
			dvdPanels[i].setLayout(new GridBagLayout());
			dvdPanels[i].setBorder(BorderFactory.createLineBorder(Color.BLUE));
			
			dvdPanels[i].add(dvdIcon[i], listgc);
			
			listgc.ipady = 100;
			listgc.gridx = 1;
			
			dvdPanels[i].add(dvdTxt[i], listgc);
			
			dvdIcon[i] = new JLabel();
			adddvd[i] = new JButton("add" + (i + 1));
			adddvdTxt[i] = new JTextField("0", 1);
			adddvdTxt[i].setEditable(false);
			subdvd[i] = new JButton("sub" +(i +1));
			
			imgdvd[i] = ImageIO.read(new File(playStr));
			dimgdvd[i] = imgdvd[i].getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			imageIcondvd[i] = new ImageIcon(dimgdvd[i]);
			playdvd[i] = new JButton("dvd " + (i+1));
			playdvd[i].setIcon(imageIcondvd[i]);
			
			listgc.ipady = 0;
			listgc.ipadx = 0;
			listgc.gridheight = 1;
			listgc.gridx = 2;
			listgc.gridy = 49 + 8*i;
			
			dvdPanels[i].add(adddvd[i], listgc);
			listgc.ipadx = 10;
			listgc.gridx = 3;
			listgc.gridy =49 + 8*i;
			
			dvdPanels[i].add(adddvdTxt[i], listgc);
			listgc.ipadx = 0;
			listgc.gridx = 4;
			listgc.gridy = 49 + 8*i;
			dvdPanels[i].add(subdvd[i], listgc);
			
			listgc.ipadx = 0;
			listgc.gridx = 5;
			listgc.gridy = 49 + 8*i;
			dvdPanels[i].add(playdvd[i], listgc);
			
			listgc.gridx = 1;
			listPanel.add(dvdPanels[i], listgc);
			adddvd[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					for(int i = 0; i < dvd.size(); ++i) {
						if(e.getActionCommand().equals("add" + (i + 1))) {
							try {
								addProduct(adddvdTxt[i], dvd.get(i));
								
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							}
					    }
				}
			});
			subdvd[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for(int i = 0; i < dvd.size(); ++i) {
						if(e.getActionCommand().equals("sub" + (i + 1))) {
							try {
								removeProduct(adddvdTxt[i], dvd.get(i));
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							}
					    }
				}
			});
			playdvd[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for(int i = 0; i < dvd.size(); ++ i) {
						if(e.getActionCommand().equals("dvd " + (i+1))) {
							try {
								DemoDisplay(dvdStr[i], dvd.get(i));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					
				}
			});
			
		}
		listPanel.repaint();
	}
	public static void addProduct(JTextField textField ,hust.soict.cttn.aims.media.Media media) throws Exception {
		if(!anOrder.NextNumbersItemOrders() ) {
			JOptionPane.showMessageDialog(null, "Full order! Can't add item", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else {
			for(int i = 0; i < date.size(); ++i) {
				if(date.get(i).getMedia().getTitle().equals(media.getTitle())) {
					date.remove(i);
					break;
				}
			}
			media.setNums(media.getNums() +1);
			date1 = new MyDate();
			anOrder.addMedia(media);
			date1.setMedia(media, media.getNums());
			textField.setText(media.getNums() + "");
			c = Calendar.getInstance();
			dt = c.getTime();
			
			date1.setDt(formatter.format(dt));
			date1.setStatus(1);
			
			date.add(date1);
		}
	}
	public static void removeProduct(JTextField textField ,hust.soict.cttn.aims.media.Media media) throws Exception {
		if(media.getNums() > 0) {
			for(int i = 0; i < date.size(); ++i) {
				if(date.get(i).getMedia().getTitle().equals(media.getTitle())) {
					date.remove(i);
					break;
				}
			}
		media.setNums(media.getNums() - 1);
		anOrder.removeMedia(media);
		if(media.getNums() > 0) {
			date1 = new MyDate();
		    date1.setMedia(media, media.getNums());
		}
		textField.setText(media.getNums() + "");
		c = Calendar.getInstance();
		dt = c.getTime();
		
		date1.setDt(formatter.format(dt));
		date1.setStatus(0);
		
		date.add(date1);
		}
	}
	
	public static void DemoDisplay(String data, hust.soict.cttn.aims.media.Media media) throws IOException {
		JFrame demoPlay = new JFrame();
		BufferedImage demoPlayImage = null;
		demoPlayImage = ImageIO.read(new File(data));
		Image dimgPlay = demoPlayImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon imgIconPlay = new ImageIcon(dimgPlay);
		JLabel picPlayLabel = new JLabel();
		picPlayLabel.setIcon(imgIconPlay);
		JTextArea playtxt = new JTextArea();
		playtxt.setText("Playing Disc: " + media.getTitle() +" \nDisc length: " + media.getLength() +" \n");
		playtxt.setEditable(false);
		JPanel demoPlayPanel = new JPanel();
		demoPlayPanel.add(picPlayLabel, BorderLayout.CENTER);
		demoPlayPanel.add(playtxt, BorderLayout.EAST);
		demoPlay.add(demoPlayPanel);
		demoPlay.setExtendedState(JFrame.MAXIMIZED_BOTH);
		demoPlay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		demoPlay.pack();
		demoPlay.setVisible(true);
	}
	public static void displayProduct() {
		JFrame disPlayFrame = new JFrame();
		JPanel displayPanel = new JPanel();;
		JLabel freeItem;
			
			freeItem = new JLabel();
			displayPanel.setLayout(new GridBagLayout());
			GridBagConstraints gcDisplay = new GridBagConstraints();
			gcDisplay.fill = GridBagConstraints.BOTH;
			gcDisplay.weightx = 0.5;
			JLabel displayLabel = new JLabel("List your item");
			displayLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
	        displayLabel.setForeground(Color.RED);
	        
	        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			Object[] columnNameDisplay = {"Tilte", "Id","Cost", "Nums", "Date"};
			Object[][] dataDisplay = null;
			DefaultTableModel model;
			if(date.size() > 0) {
			model = new DefaultTableModel(dataDisplay, columnNameDisplay) {
				public Class getColumnClass(int column) {
		               Class returnValue;
		               if ((column >= 0) && (column < getColumnCount())) {
		                   returnValue = getValueAt(0, column).getClass();
		                   
		               } else {
		                   returnValue = Object.class;
		               }
		               return returnValue;
		           }
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			}
			else {
				model = new DefaultTableModel(dataDisplay, columnNameDisplay);
			}
			
			Object[] dt = new Object[5];
			
			for(int i = 0; i < date.size(); ++i) {
				dt[0] = date.get(i).getMedia().getTitle();
				dt[1] = date.get(i).getMedia().getId();
				dt[2] = date.get(i).getMedia().getCost();
				dt[3] = date.get(i).getMedia().getNums();
				dt[4] = date.get(i).getDate();
				cost += date.get(i).getMedia().getNums()*date.get(i).getMedia().getCost();
				model.addRow(dt);
			}
			if(date.size()>0) {
				Random generator  =new Random();
				a = generator.nextInt(date.size());	
				cost -= date.get(a).getMedia().getCost();
				freeItem.setText("Congratulation! You get free a random item is '" + date.get(a).getMedia().getTitle()+ "'\n               The total is: " + cost + "$");
				freeItem.setFont(new Font("Helvetica", Font.PLAIN, 30));	
				
			}
			JTable tableDisplay = new JTable(model);
			tableDisplay.getColumnModel().getColumn(0).setPreferredWidth(100);
			String.format("Lead Selection: %d, %d. ",
		    		tableDisplay.getSelectionModel().getLeadSelectionIndex(),
		    		tableDisplay.getColumnModel().getSelectionModel().getLeadSelectionIndex());
			final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
			tableDisplay.setRowSorter(sorter);
				JButton pay = new JButton("Pay");
				pay.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(date.size() > 0) {
							labelOrder.add("You got free a random item is '" + date.get(a).getMedia().getTitle()+ "'\nThe total is: " + cost + "$");
							gcDisplay.gridx = 0;
							gcDisplay.gridy = 3;
							gcDisplay.anchor = GridBagConstraints.SOUTH;
							displayPanel.add(freeItem, gcDisplay);
							disPlayFrame.pack();
							disPlayFrame.repaint();
							listFrame.setVisible(false);
							checkOrder = false;
							cost = 0;
							writeDataUser();
						} else {
							JOptionPane.showMessageDialog(null, "Let add item to pay!", "System", JOptionPane.INFORMATION_MESSAGE);
						}
						
					}
				});


			gcDisplay.gridx = 0;
			gcDisplay.gridy = 0;
			gcDisplay.anchor = GridBagConstraints.NORTH;
			displayPanel.add(displayLabel, gcDisplay);
			gcDisplay.gridy = 1;
			gcDisplay.gridx = 0;
			gcDisplay.anchor = GridBagConstraints.CENTER;
			displayPanel.add(new JScrollPane(tableDisplay), gcDisplay);
			gcDisplay.gridx = 0;
			gcDisplay.gridy = 2;
			gcDisplay.anchor = GridBagConstraints.SOUTHWEST;
			displayPanel.add(pay, gcDisplay);
		
			JPanel panel = new JPanel(new BorderLayout());
			panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 10));
	        JLabel label = new JLabel("Search");
	        panel.add(label, BorderLayout.WEST);
	        JTextField filterText = new JTextField("");
	        panel.add(filterText, BorderLayout.CENTER);
	        JButton button = new JButton("Filter");
	        panel.add(button, BorderLayout.EAST);
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String text = filterText.getText();
	                if (text.length() == 0) {
	                    sorter.setRowFilter(null);
	                } else {
	                    try {
	                        sorter.setRowFilter(RowFilter.regexFilter(text));
	                    } catch (PatternSyntaxException pse) {
	                        System.out.println("Bad regex pattern");
	                    }
	                }
	            }
	        });
	    disPlayFrame.add(panel, BorderLayout.NORTH);    
		disPlayFrame.add(displayPanel);
		disPlayFrame.setPreferredSize(new Dimension(1650, 825));
		disPlayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		disPlayFrame.pack();
		disPlayFrame.setVisible(true);
		
	}
	
	public static void searchProduct(String nameItem) throws IOException {
		
		int a = book.size();
		for(int i = 0; i < book.size(); ++i) {
			
			if(!book.get(i).search(nameItem)) {
				listPanel.remove(bookPanels[i]);
				a--;
			}
		}
		if(a == 0) {
			listPanel.remove(bookLabel);
		}
		a = cd.size();
		for(int i = 0; i < cd.size(); ++i) {
			if(!cd.get(i).search(nameItem)) {
				listPanel.remove(cdPanels[i]);
				a--;
			}
		}
		if(a == 0) {
			listPanel.remove(cdLabel);
		}
		a = dvd.size();
		for(int i = 0; i < dvd.size(); ++i) {
			if(!dvd.get(i).search(nameItem)) {
				listPanel.remove(dvdPanels[i]);
				a--;
			}
		}
		if(a == 0) {
			listPanel.remove(dvdLabel);
		}
		listPanel.repaint();
	}
    
	
	private static void historyUser() throws IOException {

		// TODO Auto-generated method stub
		fhisUser = new File("history_user\\data.txt");
		if(!fhisUser.exists()) {
			fhisUser.createNewFile();
		}
		fr = new FileWriter(fhisUser.getAbsoluteFile(), true);
		bfr = new BufferedWriter(fr);	
		
	}
	
	private static void writeDataUser() {
		try {
			bfr.write(date.get(0).getDate() +" \n\n");
			for(int i = 0; i < date.size(); ++i) {
				bfr.write("Title: " + date.get(i).getMedia().getTitle() + "\nCategory: " + date.get(i).getMedia().getCategory() 
						+"\nCost: " + date.get(i).getMedia().getCost() + "$\nLenght: " +date.get(i).getMedia().getLength() + " pages\nId: " + date.get(i).getMedia().getId() +" \n\n\n");
				} 
			bfr.write(labelOrder.get(labelOrder.size()-1) +"\n\n-----------------------------------------------------------\n\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bfr!=null) {
				try {
					bfr.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static void historyOrder() {
		JFrame historyFrame = new JFrame();
		JScrollPane historyUserScrollPane = new JScrollPane();
		JTextArea historyUserTxt = new JTextArea();
		historyUserScrollPane.setViewportView(historyUserTxt);
		try {
			dataUserReader = new BufferedReader(new FileReader("history_user\\data.txt"));
			String line = dataUserReader.readLine();
			while(line!= null) {
				historyUserTxt.setText(historyUserTxt.getText() + " \n" + line);;
				line = dataUserReader.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(dataUserReader != null) {
				try {
					dataUserReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		historyFrame.add(historyUserScrollPane);
		historyFrame.setPreferredSize(new Dimension(1650, 825));
		historyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		historyFrame.pack();
		historyFrame.setVisible(true);
		
	}
}
