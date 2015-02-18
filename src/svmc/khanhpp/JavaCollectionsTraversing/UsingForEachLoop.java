package svmc.khanhpp.JavaCollectionsTraversing;

import java.util.ArrayList;
import java.util.List;

public class UsingForEachLoop {
	/**
	 * @Note for Using For-Each Loop cannot using for-each loop to remove
	 *       element from the collection ex: for(String name : names) {
	 *       names.remove(name); }
	 *       cannot start from middle or cannot visit the previously visited element
	 */
	public static void main(String[] args) {
		// Create a list of strings
		List<String> names = new ArrayList<>();
		names.add("A");
		names.add("B");
		names.add("C");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
