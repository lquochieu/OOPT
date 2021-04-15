package hust.soict.cttn.aims;
import java.awt.List;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

import hust.soict.cttn.aims.media.Book;
import hust.soict.cttn.aims.media.CompactDisc;
import hust.soict.cttn.aims.media.DigitalVideoDisc;
import hust.soict.cttn.aims.order.Order.Order;
import hust.soict.cttn.aims.ultils.DateTest.DateTest;
import hust.soict.cttn.aims.ultils.DateUltils.DateUltils;
import hust.soict.cttn.aims.ultils.MyDate.MyDate;
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
	
	static ArrayList<DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>(); // array of disks  what bought or removed the same day
	static ArrayList<Book> book = new ArrayList<Book>();
	static ArrayList<CompactDisc> cd = new ArrayList<CompactDisc>();
	static ArrayList<String> author = new ArrayList<String>();
	static String day, month, years;
	
	static Scanner input = new Scanner(System.in);
	static DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
	static DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
	static DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
	static Book b1 = new Book("You gifted, i am too");
	static Book b2 = new Book("Anohara");
	static CompactDisc cd1 = new CompactDisc("Pokemon");
	static CompactDisc cd2 = new CompactDisc("Conan");
	
	static LinkedList<MyDate> date = new LinkedList<MyDate>();
	static MyDate date1;
	
	static int menu;
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	public static void showChoosen() {
		System.out.println("Choose item you want to solve!");
		System.out.println("1.Book ");
		System.out.println("2.Digital Video Disc");
		System.out.println("3.Compact Disc");
		System.out.println("4. Cancel");
		System.out.println("0. Exit");
	}
	public static void showItem(int a) {
		System.out.println("Please choose items you want!");
		System.out.println("Items");
		System.out.println("-----------------------------");
		if(a == 1) {
			for(int i = 0; i < book.size(); ++i) {
				System.out.println(i+1 + "." + book.get(i).getTitle() + "\nCategory: " + book.get(i).getCategory() + "\nAuthor: "
						+ book.get(i).getAuthor() +"\nCost: " + book.get(i).getCost() + "$\nLenght: " + book.get(i).getLength() + " pages\nId: " + book.get(i).getId());
			}
			System.out.println(book.size() +1 + ". Search");
			System.out.println(book.size() +2 + ". Cancel");
		}
		else if(a == 2) {
		
			for(int i = 0; i < dvd.size(); ++i) {
				System.out.println(i+1 + "." + dvd.get(i).getTitle() + "\nCategory: " + dvd.get(i).getCategory() + "\nDirector: "
						+ dvd.get(i).getDirector() +"\nCost: " + dvd.get(i).getCost() + "$\nLenght: " + dvd.get(i).getLength() + " minutes\nId: " + dvd.get(i).getId());
			}
			System.out.println(dvd.size() +1 + ". Search");
			System.out.println(dvd.size() +2 + ". Cancel");
		
		}
		else {
			for(int i = 0; i < cd.size(); ++i) {
				System.out.println(i+1 + "." + cd.get(i).getTitle() + "\nCategory: " + cd.get(i).getCategory() + "\nArtist: "
						+ cd.get(i).getArtist() +"\nCost: " + cd.get(i).getCost() + "$\nLenght: " + cd.get(i).getLength() + " minutes\nId: " + cd.get(i).getId() );
			}
			System.out.println(cd.size() +1 + ". Search");
			System.out.println(cd.size() +2 + ". Cancel");

		}
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number:           ");
	}
	
	static void searchItems(int a) {
		String nameItem;
		int item;
		System.out.println("Enter the name");
		nameItem = input.next();
		System.out.println("Items");
		System.out.println("-----------------------------");
		if(a == 1) {
			for(int i = 0; i < book.size(); ++i) {
				if(book.get(i).search(nameItem)) {
					System.out.println(i+1 + "." + book.get(i).getTitle() + "\nCategory: " + book.get(i).getCategory() + "\nAuthor: "
							+ book.get(i).getAuthor() +"\nCost: " + book.get(i).getCost() + "$\nLenght: " + book.get(i).getLength() + " pages\nId: " + book.get(i).getId() );
				}
			}
			System.out.println( book.size() +1 +". Cancel");
		}
		else if (a == 2) {
			for(int i = 0; i < dvd.size(); ++i) {
				if(dvd.get(i).search(nameItem)) {
					System.out.println(i+1 + "." + dvd.get(i).getTitle() + "\nCategory: " + dvd.get(i).getCategory() + "\nDirector: "
							+ dvd.get(i).getDirector() +"\nCost: " + dvd.get(i).getCost() + "$\nLenght: " + dvd.get(i).getLength() + " minutes\nId: " + dvd.get(i).getId()  );
				}
			}
			System.out.println( book.size() +1 +". Cancel");
		}
		else {
			for(int i = 0; i < cd.size(); ++i) {
				if(cd.get(i).search(nameItem)) {
					System.out.println(i+1 + "." + cd.get(i).getTitle() + "\nCategory: " + cd.get(i).getCategory() + "\nArtist: "
							+ cd.get(i).getArtist() +"\nCost: " + cd.get(i).getCost() + "$\nLenght: " + cd.get(i).getLength() + " minutes\nId: " + cd.get(i).getId()  );
				}
			}
			System.out.println( cd.size() +1 +". Cancel");
		}
		System.out.println("0. Exit");
		System.out.println("-----------------------------");
		System.out.print("Please choose a number: ");
	}
	
	static void EnterDate(int u) {
		int i = 1;
		while(i != 0) {
			date1.setDay(u);
			date1.setMonth(u);
			date1.setYears(u);
			date1.setStatus(u);
			if(check.checkMonth(date1) == 0 || check.checkDay(date1) == 0) {
				System.out.println("Date isn't correct.. Please enter again!");
				}
			else {
				i = 0;
				}
			}
			date.add(date1);
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new MemoryDaemon());
		thread.setDaemon(true);
		thread.start();
		
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		dvd1.setId(1000);
		dvd.add(dvd1);
		
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(90);
		dvd2.setId(1001);
		dvd.add(dvd2);
		
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		dvd3.setId(1002);
		dvd.add(dvd3);
		
		b1.setCategory("Soft skill");
		b1.setCost(10f);
		author.add("Adamm Khoo");
		b1.setAuthor(author);
		b1.setLength(200);
		b1.setId(2000);
		book.add(b1);
		
		b2.setCategory("Romcom");
		b2.setCost(7f);
		author.clear();
		author.add("Sinkai Makoto");
		b2.setAuthor(author);
		b2.setLength(150);
		b2.setId(2001);
		book.add(b2);
		
		cd1.setCategory("Adventure");
		cd1.setCost(5f);
		cd1.setArtist("Hidenori Kusaka");
		cd1.setLength(20);
		cd1.setId(3000);
		cd.add(cd1);
		
		cd2.setCategory("Detective");
		cd2.setCost(5.5f);
		cd2.setArtist("Aoyama Gosho");
		cd2.setLength(20);
		cd2.setId(3001);
		cd.add(cd2);
		menu = -1;
		
		while(menu != 0) {
			showMenu();
			menu = input.nextInt();
			if(menu == 0) {
				continue;
				}
			if(menu == 1) {
				menu1();
				}
			else if(menu == 2) {
				int add  = -1;
				while(add != 4) {
				showChoosen();
				input = new Scanner(System.in);
				add = input.nextInt();
				if( add == 0) {
					add = 4;
					menu = 0;
				}
				else if(add == 4) {
					continue;
				}
				else if(add == 1 || add == 2 || add == 3) {
					menu2(add);			
				}
				else {
					System.out.println("Choose error");
				}
				}
			}
			else if(menu == 3) {
				int rm  = -1;
				while(rm!= 4) {
				showChoosen();
				input = new Scanner(System.in);
				rm = input.nextInt();
				if( rm == 0) {
					rm = 4;
					menu = 0;
				}
				else if(rm == 4) {
					continue;
				}
				else if(rm == 1 || rm == 2 || rm == 3) {
					menu3(rm);			
				}
				else {
					System.out.println("Choose error");
				}
				}
			
			}
			else if(menu == 4) {
				menu4();
			}
			else {
				System.out.println("Choose error");
			}	
		}
		 

		anOrder.getLuckyItem();
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost() + "\n");
		System.exit(0);
	}
	
	
	
	public static void menu1() {
		anOrder.clearMedia();
		date.clear();
		System.out.println("A new order was created");
		showMenu();
		menu = input.nextInt();
	}
	
	
	
    public static void menu2(int a) {
    	int item = -1;
    	boolean loop = true;
		while(loop) {
			
			showItem(a);
			
			input = new Scanner(System.in);
			item = input.nextInt();
			
			if(item == 0) {
				loop = false;
				menu = 0;
			}
			
            if(a == 1) {
            	if(item <= book.size() && item > 0) {
            		System.out.println("Enter the numbers of book!");
    				//Enter nums
    				//////////////////
    				//////////////////
    				int nums = 1;
    				input = new Scanner(System.in);
    				nums = input.nextInt();
    				if(!anOrder.NextNumbersItemOrders(nums) ) {
    					System.out.println("Full order!");
    				}
    				else {
    					date1 = new MyDate();
    					
    						book.get(item - 1).setNums(nums);
    						for(int i = 1; i <= nums; ++i) {
    							anOrder.addMedia(book.get(item - 1));
    							date1.setBook(book.get(item -1), nums);
    							}
    					System.out.println("You bought " + nums + " book. Please enter the date!");
    					EnterDate(1);
    					}
    				
            	}
            	else if(item == book.size() + 1) {
    				searchItems(a);
    				input = new Scanner(System.in);
    				item = input.nextInt();
    				}
            	else if(item == book.size() + 2) {
            		loop = false;
            		
            	}
            	
    			else {
    				System.out.println("Choose error");
    			}
            }
            else if(a == 2) {
            	if(item <= dvd.size() && item > 0) {
                    int ntf = 0;
            		
            		
				System.out.println("Enter the numbers of disk!");
				//Enter nums
				//////////////////
				//////////////////
				int nums = 1;
				input = new Scanner(System.in);
				nums = input.nextInt();
				if(!anOrder.NextNumbersItemOrders(nums) ) {
					System.out.println("Full order!");
				}
				else {
					date1 = new MyDate();
			
						dvd.get(item-1).setNums(nums);
						for(int i = 1; i <= nums; ++i) {
							anOrder.addMedia(dvd1);
							date1.setDisk(dvd.get(item -1), nums);
							}
					//Enter date
					///////////////
					//////////////
					System.out.println("You bought " + nums + " dvd. Please enter the date!");
					EnterDate(1);
					
				}
				System.out.println("Do you want to play it?\n1. Play\n2. Press eny number to continue.....");
        		input = new Scanner(System.in);
        		ntf = input.nextInt();
        		if(ntf == 1) {
        			dvd.get(item-1).play();
        		}
			}
            	
            	else if(item == book.size() + 1) {
    				searchItems(a);
    				input = new Scanner(System.in);
    				item = input.nextInt();
    				}
            	else if(item == book.size() + 2) {
            		loop = false;
            		
            	}
            	else {
            		System.out.println("Choose error");
            		}
            }
            else {
            	if(item <= cd.size() && item > 0) {
            		int ntf = 0;
            		
            		
            		if(cd.get(item-1).checkTracks()) {
            			System.out.println("You added disk before.");
            		}
          
            			cd.get(item-1).addTrack();
            		System.out.println("Enter the numbers of cd!");
    				//Enter nums
    				//////////////////
    				//////////////////
    				int nums = 1;
    				input = new Scanner(System.in);
    				nums = input.nextInt();
    				if(!anOrder.NextNumbersItemOrders(nums) ) {
    					System.out.println("Full order!");
    				}
    				else {
    					date1 = new MyDate();
    				
    						cd.get(item - 1).setNums(nums);
    						for(int i = 1; i <= nums; ++i) {
    							anOrder.addMedia(cd.get(item -1));
    							date1.setCompactDisc(cd.get(item -1), nums);
    							}
    					System.out.println("You bought " + nums + " cd. Please enter the date!");
    					EnterDate(1);
    					}
            		System.out.println("Do you want to play it?\n1. Play\n2. Press eny number to continue.....");
            		input = new Scanner(System.in);
            		ntf = input.nextInt();
            		if(ntf == 1) {
            			cd.get(item-1).play();
            		}
    				
            	}
            	else if(item == book.size() + 1) {
    				searchItems(a);
    				input = new Scanner(System.in);
    				item = input.nextInt();
    				}
            	else if(item == book.size() + 2) {
            		loop = false;
            		
            	}
    			else {
    				System.out.println("Choose error");
    			}
			}
		}
		
	}
    
    
    
    
    public static void menu3(int a) {
    	int item = -1;
    	boolean loop = true;
		while(loop) {
			showItem(a);
			System.out.println("(id)");
			input = new Scanner(System.in);
			item = input.nextInt();
			if(item == 0) {
				loop = true;
				menu = 0;
			}
			boolean error = false;
			boolean cf = false;
			
			if(a == 1) {
				if(item == book.size() + 1) {
					searchItems(a);
					input = new Scanner(System.in);
					item = input.nextInt();
					continue;
					}
				else if (item == book.size() + 2) {
					loop = false;
					continue;
				}
			}
			else if (a == 2){
				if(item == dvd.size() + 1) {
					searchItems(a);
					input = new Scanner(System.in);
					item = input.nextInt();
					continue;
					}
				else if (item == dvd.size() + 2) {
					loop = false;
					continue;
				}
			}
			else {
				if(item == cd.size() + 1) {
					searchItems(a);
					input = new Scanner(System.in);
					item = input.nextInt();
					continue;
					}
				else if (item == cd.size() + 2) {
					loop = false;
					continue;
				}
			}
			int nums = 1;
			if(a == 1) {
				
				for(int i = 0; i < book.size(); ++i) {
					if(item == book.get(i).getId()) {
						System.out.println("Enter the numbers of item!");
						//Enter nums
						//////////////////
						//////////////////
						
						input = new Scanner(System.in);
						nums = input.nextInt();
						cf = true;
						if(book.get(i).getNums() - nums < 0 ) {
							error = true;
							System.out.println("Error! The numbers of items less than " + nums);
						}
						else {
							if(nums == 0) {
								error =true;
								continue;
							}
							else {
								date1 = new MyDate();
								error = false;
								book.get(i).setNums(-nums);
								for(int j = 1; j <= nums; ++j) {
									anOrder.removeMedia(book.get(i), nums);
									date1.setBook(book.get(i), nums);
									}
							}
						}
						break;
					}
					
					
				}
			}
			else if(a == 2) {
				
				for(int i = 0; i < dvd.size(); ++i) {
					if(item == dvd.get(i).getId()) {
						System.out.println("Enter the numbers of item!");
						//Enter nums
						//////////////////
						//////////////////
						
						input = new Scanner(System.in);
						nums = input.nextInt();
						cf = true;
						if(dvd.get(i).getNums() - nums < 0 ) {
							error = true;
							System.out.println("Error! The numbers of items less than " + nums);
						}
						else {
							if(nums == 0) {
								error =true;
								continue;
							}
							else {
								date1 = new MyDate();
								error = false;
								dvd.get(i).setNums(-nums);
								for(int j = 1; j <= nums; ++j) {
									anOrder.removeMedia(dvd.get(i), nums);
									date1.setDisk(dvd.get(i), nums);
									}
							}
						}
						break;
					}
					
					
				}
			}
			else {
				if(cd.get(item-1).checkTracks()) {
        			System.out.println("You added disk before.");
        		}
				for(int i = 0; i < cd.size(); ++i) {
					if(item == cd.get(i).getId()) {
						System.out.println("Enter the numbers of item!");
						//Enter nums
						//////////////////
						//////////////////
						
						input = new Scanner(System.in);
						nums = input.nextInt();
						cf = true;
						if(cd.get(i).getNums() - nums < 0 ) {
							error = true;
							System.out.println("Error! The numbers of disk less than " + nums);
						}
						else {
							if(nums == 0) {
								error =true;
								continue;
							}
							else {
								date1 = new MyDate();
								error = false;
								cd.get(i).setNums(-nums);
								for(int j = 1; j <= nums; ++j) {
									anOrder.removeMedia(cd.get(i), nums);
									date1.setCompactDisc(cd.get(i), nums);
									}
							}
						}
						break;
					}
					
				}
			}
			if(error == false) {
				System.out.println("You removed " + nums + " item. Please enter the date!");
				EnterDate(0);		
				}
			
			if(cf == false) {
					System.out.println("Choose error");
			}
			
		}
	}

    
    
    
    public static void menu4() {
    	cmp.sortingDate(date);
		check.date_order(date);
	}
    
}
