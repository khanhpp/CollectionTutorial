package svmc.khanhpp.JavaCollectionsTraversing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {
	/**
	 * The class tutorial how to use Iterator to traverse a Collection in Java
	 */

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("name 1");
		names.add("name 2");
		names.add("name 3");
		// get iterator from collect using method iterator();
		Iterator<String> nameIterator = names.iterator();
		System.out.println("Before Remove ---");
		while (nameIterator.hasNext()) {
			System.out.println(nameIterator.next());
			if (nameIterator.hasNext()) {
				nameIterator.remove();
			}
		}
		// The remove() method removes the element that was returned last time
		// by the next() method. The remove() method can be called only once per
		// call to the next() method.
		//
		// If the remove() method is called more than once for each next()
		// method or before the first call to the next(), it throws an
		// IllegalStateException.
		
		System.out.println("After Remove ---");
		nameIterator = names.iterator();
		while (nameIterator.hasNext()) {
			System.out.println(nameIterator.next());
		}
		//Note for iterator:
		// iterator cannot reset and can not reused
		//To Iterate again, creat new iterator using method .iterator();
	}
}
