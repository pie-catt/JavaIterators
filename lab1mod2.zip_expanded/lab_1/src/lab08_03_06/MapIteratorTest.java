package lab08_03_06;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class MapIteratorTest {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>(Arrays.asList(new String[] { "one", "two", "three", "four", "five" }));
		
		//Function: String -> String
		Iterator<String> it = new MapIterator<>(new UppercaseFunction(), l.iterator());
		while (it.hasNext()) // print ONE \n TWO \n THREE \n FOUR \N FIVE
			System.out.println(it.next());
		
		//Function: String -> Integer
		Iterator<Integer> lt = new MapIterator<>(new StringLengthFunction(), l.iterator());
		while (lt.hasNext()) // print 3 3 5 4 4 
			System.out.println("Size= " + lt.next());
		
		//Function: String -> Boolean
		Iterator<Boolean> bt = new MapIterator<>(new EvenOddFunction(), l.iterator());
		while (bt.hasNext()) // print ODD \n ODD \n ODD \N EVEN \N EVEN
		{
			Boolean b = bt.next();
			if(b){
				System.out.println("Even");
			} else System.out.println("Odd");
		}
		
		Function<String, Integer> ff = new UppercaseFunction().andThen(new StringLengthFunction());
		//System.out.println(ff.apply("Eleven"));
		Iterator<Integer> ct = new MapIterator<>(ff, l.iterator());
		while (ct.hasNext()) // print 3 3 5 4 4 
			System.out.println("Size= " + ct.next());
	}

}
