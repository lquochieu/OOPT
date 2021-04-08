package hust.soict.cttn.aims;
import java.awt.List;
import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
	
	static LinkedList<DigitalVideoDisc>[] list = new LinkedList[10]; // array of disks  what bought or removed the same day
	static String day, month, years;
	
	static Scanner input = new Scanner(System.in);
	static DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
	static DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
	static DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
	
	static LinkedList<MyDate> date = new LinkedList<MyDate>();
	static MyDate date1;
	
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
	public static void TheLionKing() {
		System.out.println("1. The Lion King\n" +"Category: Animation\n"+"Cost: 19.95$\n"
                +"Director: Roger Allers\n"+"Lenght: 87 minutes");
		System.out.println("Id: " + dvd1.getId());
	}
	public static void StarWars() {
		System.out.println("2. Star Wars\n" +"Category: Science Fiction\n"+"Cost: 24.95$\n"
                +"Director: George Lucas\n"+"Lenght: 124 minutes");
		System.out.println("Id: " + dvd2.getId());
	}
	public static void Aladin() {
		System.out.println("3. Aladin\n" + "Category: Animation\n" + "Cost: 18.99$" 
                + "Director: John Musker\n" + "Length: 90 minutes");
		System.out.println("Id: " + dvd3.getId());
	}
	public static void showItem() {
		System.out.println("Please choose items you want!");
		System.out.println("Items");
		System.out.println("-----------------------------");
		TheLionKing();
		StarWars();
		Aladin();
		System.out.println("4. Search");
		System.out.println("5. Cancel");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	static void searchItems() {
		String nameDisk;
		int item;
		System.out.println("Enter the name of disk");
		nameDisk = input.next();
		System.out.println("Items");
		System.out.println("-----------------------------");
		if(dvd1.search(nameDisk)) {
			TheLionKing();
		}
		if(dvd2.search(nameDisk)) {
			StarWars();
		}
		if(dvd3.search(nameDisk)) {
			Aladin();
		}
		System.out.println("5. Cancel");
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
				JOptionPane.showMessageDialog(null, "Date isn't correct.. Please enter again!", "ERROR!", JOptionPane.ERROR_MESSAGE);
				}
			else {
				i = 0;
				}
			}
			date.add(date1);
	}
	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; ++i) {
			list[i] = new LinkedList<DigitalVideoDisc>();
			}
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		dvd1.setId(1234);
		
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(90);
		dvd2.setId(2345);
		
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		dvd3.setId(3456);
		
		int menu = -1;
		
		while(menu != 0) {
			showMenu();
			menu = input.nextInt();
			if(menu == 0) {
				continue;
				}
			if(menu == 1) {
				anOrder.clearMedia();
				date.clear();
				System.out.println("A new order was created");
				showMenu();
				menu = input.nextInt();
				}
			else if(menu == 2) {
				int item = -1;
				while(item != 5) {
					showItem();
					
					input = new Scanner(System.in);
					item = input.nextInt();
					if(item == 0) {
						item = 5;
						menu = 0;
					}
					if(item == 4) {
						searchItems();
						input = new Scanner(System.in);
						item = input.nextInt();
						}
					if(item == 1 || item == 2 || item == 3) {
						System.out.println("Enter the numbers of disk!");
						//Enter nums
						//////////////////
						//////////////////
						int nums = 1;
						input = new Scanner(System.in);
						nums = input.nextInt();
						if(!anOrder.NextNumbersItemOrders(nums) ) {
							JOptionPane.showMessageDialog(null, "Full orders!", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
						else {
							date1 = new MyDate();
							if(item == 1) {
								dvd1.setNums(nums);
								for(int i = 1; i <= nums; ++i) {
									anOrder.addMedia(dvd1);
									date1.setDisk(dvd1, nums);
									}
							}
							else if(item == 2) {
								dvd2.setNums(nums);
								for(int i = 1; i <= nums; ++i) {
									anOrder.addMedia(dvd2);
									date1.setDisk(dvd2, nums);
									}
							}
							else {
								dvd3.setNums(nums);
								for(int i = 1; i <= nums; ++i) {
									anOrder.addMedia(dvd3);
									date1.setDisk(dvd3, nums);
									}
								}
							//Enter date
							///////////////
							//////////////
							System.out.println("You bought " + nums + " disk. Please enter the date!");
							EnterDate(1);
							
						}
					}
					else if (item == 5) {
						continue;
					}
					else {
						System.out.println("Choose error");
					}
					
				}
				
			}
			else if(menu == 3) {
				int item = -1;
				while(item != 5) {
					showItem();
					System.out.println("Enter id item what you want to delete!");
					input = new Scanner(System.in);
					item = input.nextInt();
					if(item == 0) {
						item = 5;
						menu = 0;
					}
					if(item == 4) {
						searchItems();
						input = new Scanner(System.in);
						item = input.nextInt();
						}
					if(item == 1234 || item == 2345 || item == 3456) {
						System.out.println("Enter the numbers of disk!");
						//Enter nums
						//////////////////
						//////////////////
						int nums = 1;
						boolean error = false;
						input = new Scanner(System.in);
						nums = input.nextInt();
						date1 = new MyDate();
							if(item == 1234) {
								if(dvd1.getNums() - nums < 0 ) {
									error = true;
									System.out.println("Error! The numbers of disk less than " + nums);
								}
								else {
									if(nums == 0) {
										error =true;
										continue;
									}
									else {
										error = false;
										dvd1.setNums(-nums);
										for(int i = 1; i <= nums; ++i) {
											anOrder.removeMedia(dvd1, nums);
											date1.setDisk(dvd1, nums);
											}
									}
								}
							}
							else if(item == 2345) {
								if(dvd2.getNums() - nums < 0 ) {
									error = true;
									System.out.println("Error! The numbers of disk less than " + nums);
								}
								else {
									if(nums == 0) {
										error = true;
										continue;
									}
									else {
										error = false;
								dvd2.setNums(-nums);
								for(int i = 1; i <= nums; ++i) {
									anOrder.removeMedia(dvd2, nums);
									date1.setDisk(dvd2, nums);
									}
									}
								}
							}
							else {
								if(dvd3.getNums() - nums < 0 ) {
									error = true;
									System.out.println("Error! The numbers of disk less than " + nums);
								}
								else {
									if(nums == 0) {
										error = true;
										continue;
									}
									else {
										error = false;
								dvd3.setNums(-nums);
								for(int i = 1; i <= nums; ++i) {
									anOrder.removeMedia(dvd3, nums);
									date1.setDisk(dvd1, nums);
									}
									}
								}
								}
							//Enter date
							///////////////
							//////////////
							if(error == false) {
							System.out.println("You removed " + nums + " disk. Please enter the date!");
							EnterDate(0);		
							}
					}
					else if (item == 5) {
						continue;
					}
					else {
						System.out.println("Choose error");
					}
					
				}
			}
			else if(menu == 4) {
				cmp.sortingDate(date);
				check.date_order(date);
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
}
