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
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.CollationElementIterator;
import java.text.DecimalFormat;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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

import com.sun.glass.events.WindowEvent;
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
	static LinkedList<String> item = new LinkedList<String>();
	
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
	static DecimalFormat format = new DecimalFormat("0.##");

	static File fhisUser = null;
	static FileWriter fr = null;
	static BufferedWriter bfr = null;
	static BufferedReader dataUserReader = null;
	static File fuser = null;
	static BufferedReader user = null;
	static FileReader fruser = null;
	static JTextField usertxt = new JTextField(20);
	static JPasswordField passwordTxt = new JPasswordField(20);
	static JFrame loginFrame = new JFrame();
	static JPanel loginPanel = new JPanel();
	static JFrame registerFrame = new JFrame();
	static JPanel registerPanel = new JPanel();
	static JLabel incorrectLabel;
	static JLabel successLabel;
	static JLabel checkRegisterLabel ;
	static File createFile;
	static JLabel existNameLabel;
	static boolean status = true;
	static boolean checkShop = false;
	public static void main(String[] args) throws IOException {
//		Thread thread = new Thread(new MemoryDaemon());
//		thread.setDaemon(true);
//		thread.start();
		
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(88);
		dvd1.setId(1000);
		for(int i = 1; i <= 4; ++i) {
			dvd1.addTrack(dvd1.getTitle() + " part " + i, 21 + i/2);
		}
		dvd.add(dvd1);
		testMedia.addMedia(dvd1);
		
		item.add(dvd1.getTitle());
		
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(90);
		for(int i = 1; i <= 4; ++i) {
			dvd2.addTrack(dvd2.getTitle() + " part " + i, 22 + (i-1)/2);
		}
		dvd2.setId(1001);
		dvd.add(dvd2);
		testMedia.addMedia(dvd2);
		item.add(dvd2.getTitle());

		
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		dvd3.setId(1002);
		for(int i = 1; i <= 4; ++i) {
			dvd3.addTrack(dvd3.getTitle() + " part " + i, 20 + i);
		}
		dvd.add(dvd3);
		testMedia.addMedia(dvd3);
		item.add(dvd3.getTitle());

		b1.setCategory("Soft skill");
		b1.setCost(10f);
		author.add("Adamm Khoo");
		for(int i = 0; i < author.size(); ++i) {
			b1.addAuthor(author.get(i));
		}
		b1.setLength(200);
		b1.setId(2000);
		book.add(b1);
		testMedia.addMedia(b1);
		item.add(b1.getTitle());

		b2.setCategory("Romcom");
		b2.setCost(7f);
		author.clear();
		author.add("Sinkai Makoto");
		for(int i = 0; i < author.size(); ++i) {
			b2.addAuthor(author.get(i));
		}
		b2.setLength(150);
		b2.setId(2001);
		book.add(b2);
		testMedia.addMedia(b2);
		item.add(b2.getTitle());

		cd1.setCategory("Adventure");
		cd1.setCost(5f);
		cd1.setArtist("Hidenori Kusaka");
		cd1.setLength(20);
		cd1.setId(3000);
		for(int i = 1; i <= 2; ++i) {
			cd1.addTrack(cd1.getTitle() + " part " + i, 10);
		}
		cd.add(cd1);
		testMedia.addMedia(cd1);
		item.add(cd1.getTitle());

		cd2.setCategory("Detective");
		cd2.setCost(5.5f);
		cd2.setArtist("Aoyama Gosho");
		cd2.setLength(20);
		cd2.setId(3001);
		for(int i = 1; i <= 2; ++i) {
			cd2.addTrack(cd2.getTitle() + " part " + i, 10);
		}
		cd.add(cd2);
		testMedia.addMedia(cd2);
		item.add(cd2.getTitle());

		mDate.add(date);
		login();
		register();
		welcome();
	}
	
	public static void login() throws IOException {
		
		
		JLabel welcomLabel = new JLabel("Welcom to my store", JLabel.CENTER);
		welcomLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
        welcomLabel.setForeground(Color.RED);
		
        JLabel username = new JLabel("Username");
		JLabel password = new JLabel("Password");
		
		JButton loginButton = new JButton("Login");
		JButton registerButton = new JButton("Register");
		JButton shopButton = new JButton();
		BufferedImage shopbfImg = ImageIO.read(new File("label_item\\shop.jpg"));
		Image shopImg = shopbfImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon shopIcon = new ImageIcon(shopImg);
		shopButton.setIcon(shopIcon);
		loginPanel.setLayout(new GridBagLayout());
		GridBagConstraints gclogin = new GridBagConstraints();
		gclogin.fill = GridBagConstraints.HORIZONTAL;
		gclogin.gridx = 0;
		gclogin.gridy = 0;
		loginPanel.add(username, gclogin);
		gclogin.gridwidth = 3;
		gclogin.gridx = 1;
		loginPanel.add(usertxt, gclogin);
		gclogin.gridwidth = 1;
		gclogin.gridx = 0;
		gclogin.gridy = 1;
		loginPanel.add(password, gclogin);
		gclogin.gridwidth = 3;
		gclogin.gridx = 1;
		loginPanel.add(passwordTxt, gclogin);
		gclogin.gridwidth = 1;
		gclogin.gridy = 2;
		gclogin.gridx = 1;
		loginPanel.add(shopButton, gclogin);
		gclogin.gridx = 2;
		loginPanel.add(loginButton, gclogin);
		gclogin.gridx = 3;
		loginPanel.add(registerButton, gclogin);
		
		
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					try {
						if(usertxt.getText().length() > 0) {

							user();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		registerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				registerFrame.setVisible(true);
			}
		});
		shopButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					if(!checkShop) {
						listProduct();
					}
					listFrame.setVisible(true);
					status = false;
					checkShop = true;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		incorrectLabel = new JLabel();
		successLabel = new JLabel();
		loginFrame.add(successLabel, BorderLayout.AFTER_LINE_ENDS);
		loginFrame.add(loginPanel);
		loginFrame.add(incorrectLabel, BorderLayout.SOUTH);
		loginFrame.add(welcomLabel, BorderLayout.NORTH);
		loginFrame.setPreferredSize(new Dimension(600, 600));
		loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		loginFrame.pack();
		loginFrame.setVisible(true);
		
	}
	public static void register() {
		JLabel welcomLabel = new JLabel("Welcom to my store", JLabel.CENTER);
		welcomLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
        welcomLabel.setForeground(Color.RED);
		
        JLabel username = new JLabel("Username");
		JLabel password = new JLabel("Pass word");
		JLabel repeatpassword = new JLabel("Repeat password");
		JButton registerButton = new JButton("Register");
		JButton backButton = new JButton("Back");
		JTextField registerUsername = new JTextField(20);
		JPasswordField registerPassword = new JPasswordField(20);
		JPasswordField registerRepeatPassword = new JPasswordField(20);
		registerPanel.setLayout(new GridBagLayout());
		GridBagConstraints gclogin = new GridBagConstraints();
		gclogin.fill = GridBagConstraints.HORIZONTAL;
		gclogin.gridx = 0;
		gclogin.gridy = 0;
		registerPanel.add(username, gclogin);
		gclogin.gridwidth = 3;
		gclogin.gridx = 1;
		registerPanel.add(registerUsername, gclogin);
		gclogin.gridwidth = 1;
		gclogin.gridx = 0;
		gclogin.gridy = 1;
		registerPanel.add(password, gclogin);
		gclogin.gridwidth = 3;
		gclogin.gridx = 1;
		registerPanel.add(registerPassword, gclogin);
		gclogin.gridwidth = 1;
		gclogin.gridx = 0;
		gclogin.gridy = 3;
		registerPanel.add(repeatpassword, gclogin);
		gclogin.gridwidth = 3;
		gclogin.gridx = 1;
		registerPanel.add(registerRepeatPassword, gclogin);
		gclogin.gridwidth = 1;
		gclogin.gridx = 3;
		gclogin.gridy = 4;
		registerPanel.add(registerButton, gclogin);
		gclogin.gridx = 2;
		registerPanel.add(backButton, gclogin);
		registerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				createFile = new File("data_user\\" + registerUsername.getText() + ".txt");

					if(registerPassword.getText().equals(registerRepeatPassword.getText()) 
							&& registerPassword.getText().length() > 5 && registerUsername.getText().length() > 0 && !createFile.exists()) {
						loginFrame.remove(incorrectLabel);
						loginFrame.remove(successLabel);
						successLabel.setText("You have successfully registered");
						successLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
						loginFrame.add(successLabel, BorderLayout.SOUTH);
						loginFrame.repaint();
						loginFrame.pack();
						registerFrame.remove(existNameLabel);
						registerFrame.remove(checkRegisterLabel);
						registerFrame.repaint();
						registerFrame.pack();
						registerFrame.setVisible(false);
						loginFrame.setVisible(true);
						BufferedWriter bwpassword = null;
					    try {
							createFile.createNewFile();
							bwpassword = new BufferedWriter(new FileWriter(createFile));
							bwpassword.write(registerPassword.getText());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							System.out.println("Can't create account");
						} finally {
							if(bwpassword != null) {
								try {
									bwpassword.close();
								} catch (Exception e2) {
									// TODO: handle exception
									e2.printStackTrace();
								}
							}
						}

					} else {
						if(createFile.exists()) {
							registerFrame.remove(existNameLabel);
							registerFrame.remove(checkRegisterLabel);
							existNameLabel.setText("Username has existed");
							existNameLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
							registerFrame.add(existNameLabel, BorderLayout.SOUTH);
							registerFrame.repaint();
						    registerFrame.pack();
						    registerFrame.setVisible(true);
						}
						else {
							registerFrame.remove(existNameLabel);
							registerFrame.remove(checkRegisterLabel);
							checkRegisterLabel.setText("You need make sure  both the username and the passwor are greater than 6 characters");					}
					        checkRegisterLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
					        registerFrame.add(checkRegisterLabel);
					        registerFrame.repaint();
						    registerFrame.pack();
						    registerFrame.setVisible(true);
						}   
			}
		});
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				registerFrame.setVisible(false);
			}
		});
		checkRegisterLabel = new JLabel();
		existNameLabel = new JLabel();
		registerFrame.add(registerPanel);
		registerFrame.add(existNameLabel, BorderLayout.AFTER_LINE_ENDS);
		registerFrame.add(checkRegisterLabel, BorderLayout.SOUTH);
		registerFrame.add(welcomLabel, BorderLayout.NORTH);
		registerFrame.setPreferredSize(new Dimension(1200, 800));
		registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		registerFrame.repaint();
		registerFrame.pack();
	}
	public static void welcome() {
		JButton createButton = new JButton("Create new order");
		JButton listProductButton = new JButton("List products");
		JButton displayButton = new JButton("List items");
		JButton historyButton = new JButton("History order");
		JButton logoutButton = new JButton("Log out");
		panel.setLayout(new GridLayout(6, 1));
		panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
		panel.add(createButton);
		panel.add(listProductButton);
		panel.add(displayButton);
		panel.add(historyButton);
		panel.add(logoutButton);
		bookPanels[0] = new JPanel();
		bookPanels[1] = new JPanel();
		try {
			if(!checkShop) {
				listProduct();
				checkShop = true;
			}
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
	
					listPanel.repaint();
					listFrame.pack();
					listFrame.setVisible(true);
				
			}
		});
		
		displayButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					try {
						displayProduct();
					} catch (PlayerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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
		logoutButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				status = false;
				frame.setVisible(false);
				loginFrame.setVisible(true);
			}
		});
		frame.setTitle("Order Management Application");
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension(600, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(false);
		
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
				System.out.println("Can't find data usser");
			}
			JOptionPane.showMessageDialog(null, "A order was complete created!");
		}
		
	}
	public static void listProduct() throws IOException {
		listPanel.setLayout(new GridBagLayout());
		JPanel searchPanel = new JPanel();
		JLabel searLabel = new JLabel("Search ");
		JButton searchButton = new JButton("Enter");
		JButton backButton = new JButton("Back");
		JPanel southPanel = new JPanel();
		
		DefaultComboBoxModel searchComboBoxMode = new DefaultComboBoxModel();
		searchComboBoxMode.addElement("");
		for(int i = 0; i < item.size(); ++i) {
			searchComboBoxMode.addElement(item.get(i));
		}
		JComboBox searchComboBox = new JComboBox(searchComboBoxMode);
		searchComboBox.setEditable(true);
		JTextField searchTextField = (JTextField) searchComboBox.getEditor().getEditorComponent();
		
		searchPanel.add(searLabel);
		searchPanel.add(searchComboBox);
		searchPanel.add(searchButton);
		listgc.fill = GridBagConstraints.HORIZONTAL;
		listgc.gridwidth = 3;
		
		listgc.ipadx = 200;
		listgc.gridx = 0;
		listgc.gridy = 0;
		
		addBook();
		addCd();
		addDvd();
		
		BufferedImage cartImng = null;
		cartImng = ImageIO.read(new File("label_item\\giohang.png"));
		Image dcartImg = cartImng.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon cartImgIcon = new ImageIcon(dcartImg);
		JButton cartButton = new JButton();
		cartButton.setIcon(cartImgIcon);
		
		cartButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					try {
						displayProduct();
					} catch (PlayerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listFrame.setVisible(false);
			}
		});
		listFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				listFrame.setVisible(false);
			}
		});
		JScrollPane vJScrollPane = new JScrollPane(listPanel);
		vJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		southPanel.add(backButton);
		southPanel.add(cartButton);
		listFrame.add(searchPanel, BorderLayout.NORTH);
		listFrame.add(vJScrollPane, BorderLayout.CENTER);
		listFrame.add(southPanel, BorderLayout.SOUTH);
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
		bookStr[1] = "label_item\\anohana.jpg";
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
								if (status) {
									addProduct(addBookTxt[i], book.get(i));
								} else {
									JOptionPane.showMessageDialog(null, "Please login to buy item", "System", JOptionPane.INFORMATION_MESSAGE);
								}
													
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
								if (status) {
									removeProduct(addBookTxt[i], book.get(i));
								}
								else {
									JOptionPane.showMessageDialog(null, "Please login to buy item", "System", JOptionPane.INFORMATION_MESSAGE);
								}
								
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
			cdTxt[i].setText(cd.get(i).getTitle() + "\nCategory: " + cd.get(i).getCategory() + "\nArtist: "
						+ cd.get(i).getArtist() +"\nCost: " + cd.get(i).getCost() + "$\nLenght: " + cd.get(i).getLength() + " minutes\nId: " + cd.get(i).getId());
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
							    if(status) {
							    	addProduct(addcdTxt[i], cd.get(i));
							    }
							    else {
							    	JOptionPane.showMessageDialog(null, "Please login to buy item", "System", JOptionPane.INFORMATION_MESSAGE);
								}
								
								
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
								if(status) {
									removeProduct(addcdTxt[i], cd.get(i));
								}
								else {
									JOptionPane.showMessageDialog(null, "Please login to buy item", "System", JOptionPane.INFORMATION_MESSAGE);
								}
								
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
			dvdTxt[i].setText(dvd.get(i).getTitle() + "\nCategory: " + dvd.get(i).getCategory() + "\nDirector: "
						+ dvd.get(i).getDirector() +"\nCost: " + dvd.get(i).getCost() + "$\nLenght: " + dvd.get(i).getLength() + " minutes\nId: " + dvd.get(i).getId());
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
								if(status) {
									addProduct(adddvdTxt[i], dvd.get(i));
								    }
								else {
									JOptionPane.showMessageDialog(null, "Please login to buy item", "System", JOptionPane.INFORMATION_MESSAGE);
								}
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
								if(status) {
									removeProduct(adddvdTxt[i], dvd.get(i));
								}
								else {
									JOptionPane.showMessageDialog(null, "Please login to buy item", "System", JOptionPane.INFORMATION_MESSAGE);
								}
								
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
		if(checkOrder) {
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
		else {
			JOptionPane.showMessageDialog(null, "You need create new order to add item!", "System", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void removeProduct(JTextField textField ,hust.soict.cttn.aims.media.Media media) throws Exception {
		if(checkOrder) {
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
		} else {
			JOptionPane.showMessageDialog(null, "You need create new order to add item!", "System", JOptionPane.INFORMATION_MESSAGE);

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
		playtxt.setText("Playing Disc: " + media.getTitle() +" \nDisc length: " + media.getLength() +" minutes\n");
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
	public static void displayProduct() throws PlayerException {
		JFrame disPlayFrame = new JFrame();
		JPanel displayPanel = new JPanel();
		JLabel freeItem;
		JButton pay = new JButton("Pay");
		JButton backButton = new JButton("Back");
		JPanel southPanel = new JPanel();
		southPanel.add(backButton);
		southPanel.add(pay);
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
			LinkedList<Float> random = new LinkedList<Float>();
			LinkedList<Integer> rd = new LinkedList<Integer>();
			if(checkOrder) {
				if(date.size()>0) {
					for(int i = 0; i < date.size(); ++i) {
						if(date.get(i).getMedia().getCost() < cost/10) {
							random.add(date.get(i).getMedia().getCost());
							rd.add(i);
						}
					}
					if(random.size() > 0) {
						Random generator  =new Random();
						a = generator.nextInt(random.size());	
						cost -= date.get(rd.get(a)).getMedia().getCost();
						freeItem.setText("Congratulation! You get free a random lucky item is '" + date.get(a).getMedia().getTitle()+ "'\n               The total is: " + format.format(cost) + "$");
						freeItem.setFont(new Font("Helvetica", Font.PLAIN, 30));	
					}
					else {
						freeItem.setText("The total is: " + format.format(cost) + "$");
						freeItem.setFont(new Font("Helvetica", Font.PLAIN, 30));	
					}
					
					
				}
			} else {

				freeItem.setText(labelOrder.get(labelOrder.size() - 1));
				freeItem.setFont(new Font("Helvetica", Font.PLAIN, 30));
			}
			
			JTable tableDisplay = new JTable(model);
			tableDisplay.getColumnModel().getColumn(0).setPreferredWidth(100);
			String.format("Lead Selection: %d, %d. ",
		    		tableDisplay.getSelectionModel().getLeadSelectionIndex(),
		    		tableDisplay.getColumnModel().getSelectionModel().getLeadSelectionIndex());
			final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
			tableDisplay.setRowSorter(sorter);
				
				pay.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(checkOrder) {
							if(date.size() > 0) {
								if(rd.size()>0) {
									labelOrder.add("You got free a random lucky item is '" + date.get(rd.get(a)).getMedia().getTitle()+ "'\nThe total is: " + format.format(cost) + "$");
								}
								else {
									labelOrder.add("The total is: " + format.format(cost) + "$");
								}
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
						
					}
				});
				backButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						disPlayFrame.setVisible(false);
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
			displayPanel.add(southPanel, gcDisplay);
		
			JPanel panel = new JPanel(new BorderLayout());
			panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 10));
	        JLabel label = new JLabel("Search");
	        panel.add(label, BorderLayout.WEST);
	        JTextField filterText = new JTextField("");
	        panel.add(filterText, BorderLayout.CENTER);
	        JButton button = new JButton("Filter");
	        panel.add(button, BorderLayout.EAST);
	        
	        
	        BufferedImage biDisplay = null;
	        Image imgDisplay= null;
	        ImageIcon iconDisplay = null;
	        try {
				biDisplay = ImageIO.read(new File("label_item\\playButton.png"));
				imgDisplay = biDisplay.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				iconDisplay = new ImageIcon(imgDisplay);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        JButton displayButton = new JButton();
	        displayButton.setIcon(iconDisplay);
	        
	        displayButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					boolean a = false;
			        for(int i = 0; i < cd.size(); ++i) {
			        	if(cd.get(i).getNums() > 0) {
			        		a = true;
			        		try {
								cd.get(i).play();
								cd.get(i).startPlay();
							} catch (PlayerException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
			        	}
			        }
			        for(int i = 0; i < dvd.size(); ++i) {
			        	if(dvd.get(i).getNums() > 0) {
			        		a = true;
			        		try {
								dvd.get(i).play();
								dvd.get(i).startPlay();
							} catch (PlayerException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
			        	}
			        }
			        if(!a) {
			        	JOptionPane.showMessageDialog(null, "You don't have any item cd or dvd to display", "System", JOptionPane.INFORMATION_MESSAGE);
			        }
				}
			});
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
	    disPlayFrame.add(displayButton, BorderLayout.EAST);
	    disPlayFrame.add(panel, BorderLayout.NORTH);    
		disPlayFrame.add(displayPanel);
		disPlayFrame.setPreferredSize(new Dimension(1650, 825));
		disPlayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		disPlayFrame.repaint();
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
    
	private static void user() throws IOException {
		// TODO Auto-generated method stub
				incorrectLabel.setText("Username or password incorrect!");
				incorrectLabel.setFont(new Font("Helvetica", Font.PLAIN, 30));
				fuser = new File("data_user\\" + usertxt.getText() + ".txt");		
				if(!fuser.exists()) {
					loginFrame.remove(successLabel);
					loginFrame.repaint();
					loginFrame.pack();
					loginFrame.setVisible(true);
				}
				else {
					try {
						fruser = new FileReader(fuser);
						user = new BufferedReader(fruser);
						String a = user.readLine();
						if(a.equals(passwordTxt.getText())) {
							frame.setVisible(true);
							historyUser();
							status = true;
							loginFrame.remove(incorrectLabel);
							loginFrame.repaint();
							loginFrame.pack();
							loginFrame.setVisible(false);
						}
						else {
							loginFrame.remove(successLabel);
							loginFrame.repaint();
							loginFrame.pack();
							loginFrame.setVisible(true);
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println("Username or password wrong");
					} finally {
						if(user!= null) {
							user.close();
						}
					}
					
					
				}
				
	}
	private static void historyUser() throws IOException {

		// TODO Auto-generated method stub
		        fhisUser = new File("history_user\\" + usertxt.getText() + ".txt");
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
			System.out.println("Can't record data user");
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
		JButton deleteHistory = new JButton("Delete");
		JButton saveHistory = new JButton("Save");
		JButton backButton = new JButton("Back");
		JPanel menuHisitory = new JPanel();
		menuHisitory.add(backButton);
		menuHisitory.add(saveHistory);
		menuHisitory.add(deleteHistory);
		historyUserScrollPane.setViewportView(historyUserTxt);
		try {
			dataUserReader = new BufferedReader(new FileReader(fhisUser));
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
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				historyFrame.setVisible(false);
			}
		});
		saveHistory.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean a = true;
				int i = JOptionPane.showConfirmDialog(null, "Do you want to change history?", "System", JOptionPane.YES_NO_OPTION);
				if(i == JOptionPane.YES_OPTION) {
					try {
						fr = new FileWriter(fhisUser.getAbsoluteFile(), false);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					bfr = new BufferedWriter(fr);
					try {
						bfr.write(historyUserTxt.getText());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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
				try {
					fr = new FileWriter(fhisUser.getAbsoluteFile(), true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				bfr = new BufferedWriter(fr);
			}
		});
		
		deleteHistory.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean a = true;
				int i = JOptionPane.showConfirmDialog(null, "Do you want to change history?", "System", JOptionPane.YES_NO_OPTION);
				if(i == JOptionPane.YES_OPTION) {
					try {
						fr = new FileWriter(fhisUser.getAbsoluteFile(), false);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					bfr = new BufferedWriter(fr);
					try {
						bfr.write("");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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
				try {
					fr = new FileWriter(fhisUser.getAbsoluteFile(), true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				bfr = new BufferedWriter(fr);
			}
		});
		historyFrame.add(historyUserScrollPane);
		historyFrame.add(menuHisitory, BorderLayout.SOUTH);
		historyFrame.setPreferredSize(new Dimension(1650, 825));
		historyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		historyFrame.pack();
		historyFrame.setVisible(true);
		
	}
}
