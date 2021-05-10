package hust.soict.cttn.aims.media;

import java.util.ArrayList;

public class BookTest {
	static ArrayList<Book> book = new ArrayList<Book>();
	static Book b1 = new Book("You gifted, i am too");
	static Book b2 = new Book("Anohara");
	static ArrayList<String> author = new ArrayList<String>();

	public static void main(String[] args) {
		b1.setCategory("Soft skill");
		b1.setCost(10f);
		author.add("Adamm Khoo");
		b1.setAuthor(author);
		b1.setLength(200);
		b1.setId(2000);
		book.add(b1);
		b1.addContens("Hello, my name is Hiep, i am testing lab 08. Ok, let's start");
		b1.ProcessContent();
		b2.setCategory("Romcom");
		b2.setCost(7f);
		author.clear();
		author.add("Sinkai Makoto");
		b2.setAuthor(author);
		b2.setLength(150);
		b2.setId(2001);
		book.add(b2);
	}
}
