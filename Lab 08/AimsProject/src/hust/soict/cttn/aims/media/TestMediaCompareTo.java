package hust.soict.cttn.aims.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMediaCompareTo implements Runnable{
	Collection collection = new ArrayList();
	//Add the DVD objects to the ArrayList
	public void addMedia(Media media) {
		collection.add(media);
	}
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Iterator iterator = collection.iterator();
		System.out.println("-------------------------------------");
		System.out.println("The Media currently in the order are: ");
		while(iterator.hasNext()) {
			Media media = (Media) iterator.next();
			System.out.println(media.getTitle() +" \n" + media.getCost() + " \n" + media.getLength());;
		}
		
		Collections.sort((List) collection);
		iterator = collection.iterator();
		
		System.out.println("-------------------------------------");
		System.out.println("The Media in sorted order are: ");
		while(iterator.hasNext()) {
			Media media = (Media) iterator.next();
			System.out.println(media.getTitle() +" \n" + media.getCost() + " \n" + media.getLength());;
		}
		
		System.out.println("-------------------------------------");
	}
	
}
