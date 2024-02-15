import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DataStructure {
	Collection c;
	Vector v;
	List L;
	WebDriver driver;
	//Java 1.1 Legacy Class all of them are synchronized
	// Vector is the first data structure of Java -- Grows automatically - Synchronized
	// Stack - LIFO concept last in first out
	// Properties - key value concept --we can retrieve value through key only
	// Dictionary - Depricated
	// Hash Table - key value pair  -- synchronized
	//Enumeration is a interface or cursor
	
	//Java 1.2 
	
	//Collection API
	//Collection - collection is an interface of individual object  -- Seriliazable and
	// Cloneable  
	public void collectionMethod() {
		c.add(7); //to add one value
		c.addAll(v); // to add one collection reference
		c.clear();// clean the references
		c.contains(c);// to check whether a value is present or not
		c.containsAll(v);// check if a reference is present or not
		c.equals(c); // compares object
		c.isEmpty();//refrence has any value or not
		//Iterator is a interface or universal cursor 
		Iterator i = c.iterator(); // to iterate through an object
		c.remove(7); // remove given value
		c.removeAll(v);	//remove given reference
		c.retainAll(v);// remove everything except given reference
		
		Object[] o = c.toArray(); // convert collection to array
		
		c.size();
		
	
		//List is a interface
		
		// When we should go for list ?
		// Duplicates are allowed 
		// Insertion order is preserved
		
		
		// List specific methods
		
		L.add(o); 
		L.addAll(c);
		L.get(0);// To get a value by index
		L.indexOf(o); // gives the number of index of an object from beginning
		L.lastIndexOf(o); // index of object from ending
		ListIterator li = L.listIterator();// is an interface which helps iterate only list specific objects
		L.remove(0); // remove by index 
		
		
		//When we should go for vector?
		
		//Duplicate allowed and insertion order preserved and project synchronized
		
		//Legacy Class
		
		// frequently retrieval operation
		
		//When we should go for ArrayList?
		// Not synchronized 
		//Not legacy class
		// Frequently retrieval 
		
		// ArrayList vs Vector
		// Not synchronized vs Synchronized
		// Not legacy vs legacy
		// faster vs slower
		
		
		//Common Attributes of both ArrayList and vector
		
		//It has consecutive memory location so that why insertion and deletion is the worst choice
		//Because of consecutive memory when we insert it will perform internally right shift operation and 
		// when we delete internally it will do an left shift operation
		// It implements random access interface [markup interface]
		// Because of this interface retrieval operation is the best choice 
		//By default it take 10 spaces in memory
		// Underline data structure is growable or dynamic array
		//It means whenever we need to insert any value greater than default space it will generate a formula
		// to increase the memory location  
		// Default loc * 3/2 + 1 
		// Ex : 10 * 3/2 + 1  = 16
		
		// Insertion and deletion is the worst choice for ArrayList and vector
		// To over come this LinkedList takes place.
		// Linked List : underlying data structure for linked list is doubly linked list
		// Retrieval operation is the worst choice for linked list 
		// Insertion is the best choice for linked list
		
		/**
		 * Stack 
		 * 
		 * Underline data structure is LIFO - Last in first out
		 * Queue 
		 * 
		 * Underline data structure is FIFO - first in first out
		 */
		
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		ArrayList a = new ArrayList ();
		
		n.add(8);
		n.add(9);
		
		n.add("Hi");
		
		a.add(10);
		
		a.add("String");
		
		
		
		
		
		
		
		/**
		 * 
		 */
		
		
		
		
		
		
	}
	
	
	public ArrayList<Integer> copyArray(ArrayList<Integer> a) {
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		Iterator<Integer> i = a.iterator();
		
		while(i.hasNext()) {
			Integer v = i.next();
			b.add(v);
		}
		
		return b;
		
	}
	
	@Test
	public void test1() {
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(9);
		c.add(10);
		ArrayList<Integer> d =  copyArray(c);
		
		Iterator a = d.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
	}
	
	
	
	//Util methods
	
	public ArrayList<String> getActualValue(List<WebElement> elements) {
		ArrayList<String> s = new ArrayList<String>(elements.size());
		Iterator<WebElement> e = elements.iterator();
		
		while(e.hasNext()) {
			WebElement k = e.next();
			String l = k.getText();
			s.add(l);
			
	}
		return s;
		
	}
	
	public ArrayList<String> getExpectedValue(String[] s) {
		ArrayList<String> t = new ArrayList<String>(s.length);
		
		for(String value: s) {
			t.add(value);
		}
		
		
		return t;
		
	}
	
	public void compareText(ArrayList<String> s, ArrayList<String> t) {
		
		Iterator <String> i = s.iterator(); // actual
		Iterator <String> i1 = t.iterator();// expected
		
		
		while(i.hasNext() && i1.hasNext()) {
			if(i.next().equals(i1.next())) {
				System.out.println("Matched");
			}
			else {
				System.out.println("Did not match !");
			}
		}
		
		
		
	}
	
	
	@Test
	public void verifyMenuText() {
		String[] a1 = {"Man","Women"}
		ArrayList<String> a= getActualValue(driver.findElements(By.xpath("//*[@id=\"raven-header-mega-menu\"]/nav/ol/li/a")));
		ArrayList<String> b = getExpectedValue(a1);
		compareText(a, b);
		
	}
	
	
	public ArrayList<String> getActualAttributeValue(List<WebElement> elements) {
		ArrayList<String> s = new ArrayList<String>(elements.size());
		Iterator<WebElement> e = elements.iterator();
		
		while(e.hasNext()) {
			WebElement k = e.next();
			String l = k.getAttribute("class");
			s.add(l);
			
			String s1 = "$98.00";
			Double price = Double.parseDouble(s1.replace("$", ""));
			
			
	}
		return s;
		
	}
	
	
	public WebElement waitForElement(WebElement element,WebDriver driver) {
	    WebDriverWait w = new WebDriverWait(driver, 10);
	    w.until(ExpectedConditions.visibilityOf(element));
	    return element;
	}


	
	

}
