package lab08_03_06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RangeTest {
	
	/**
	 * Method for sum of all Integer in a Collection
	 */
	public static int sumAll(Collection<Integer> col){
		
		int sum = 0;
		Iterator<Integer> i = col.iterator();
		while(i.hasNext()){
			
			sum += i.next();
			
		}
		
		return sum;
		
	}
	
	/**
	 * Method for sum of all Integer in a Collection using enhanced for
	 */
	public static int sumAllEnh(Collection<Integer> col){
		
		int sum = 0;
		for(int i : col){
			sum += i;
		}		
		
		return sum;
		
	}
	
	
	//Main
	public static void main(String[] args) {
		Range r = new Range(2);
		Iterator<Integer> it1 = r.iterator();
		// test with while, prints 0 0 \n 0 1 \n 1 0 \n 1 1 \n		
		while (it1.hasNext()) {
			int x = it1.next(); // unboxing conversion
			Iterator<Integer> it2 = r.iterator();
			while (it2.hasNext())
				System.out.println(x + " " + it2.next()); // string conversion
		}
		// test with enhanced-for, prints 0 0 \n 0 1 \n 1 0 \n 1 1 \n
		for (int x : r) // unboxing conversion
			for (int y : r) // unboxing conversion
				System.out.println(x + " " + y); // string conversion
		r = new Range(1, 3);
		// test with enhanced-for, prints 1 1 \n 1 2 \n 2 1 \n 2 2 \n
		for (int x : r)
			for (int y : r)
				System.out.println(x + " " + y);
		
		//test sumAll method, prints "Somma = 6"
		List<Integer> ls = new LinkedList<Integer>(Arrays.asList(
				new	Integer[] {1,2,3}));
		System.out.println("\nSomma = " + sumAll(ls));
		
		//test sumAll method, prints "Somma = 6"
		System.out.println("\nSomma = " + sumAllEnh(ls));
		
		
	}
}
