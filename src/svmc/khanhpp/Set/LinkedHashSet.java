package svmc.khanhpp.Set;

import java.util.Set;

/**
 * @author Pham Phuc Khanh Note LinkedHashSet is implementation of Set interface
 *         keep the element order as the elements were inserted
 */
public class LinkedHashSet {
	public static void main(String[] args) {
		Set<String> s1 = new java.util.LinkedHashSet<>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");
		System.out.println("LinkedHashSet: " + s1);
	}
}
