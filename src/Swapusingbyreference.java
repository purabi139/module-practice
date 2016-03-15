import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Swapusingbyreference {

	public static void main(String[] args) {

		// How to swap two variables,by using pass by reference method ?
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1 + s2);
		swap(s1, s2);

	}

	public static void swap(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println(s1 + s2);
	}
	// String v="null";
	// System.out.println(v);
	// List al = new ArrayList();
	// List l= Collections.unmodifiableList(al);
	// An immutable class is a class which cannot be modified.It has to be
	// declared as final so that it cannot be used in polymorphism and
	// inheritence

}

/*
 * 
 * public final class Contacts {
 * 
 * private final String name; private final String mobile;
 * 
 * public Contacts(String name, String mobile) { this.name = name; this.mobile =
 * mobile; }
 * 
 * public String getName(){ return name; }
 * 
 * public String getMobile(){ return mobile; } }
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2013/03/how-to-create-immutable-class-
 * object-java-example-tutorial.html#ixzz3yYnL6Yje
 * 
 * 
 */