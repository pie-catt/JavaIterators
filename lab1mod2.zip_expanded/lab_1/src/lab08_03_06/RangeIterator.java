package lab08_03_06;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class representing Iterators on Range of Integer
 * 
 * @author Pietro Cattaneo
 *
 */
public class RangeIterator implements Iterator<Integer> {

	private final int end;
	private int current;

	/**
	 * Creates a new Iterator on the range specified by min and max
	 * 
	 * @param start the first number 
	 * @param end the last number
	 */
	public RangeIterator(int start, int end){
		
		this.end = end;
		this.current = start;	
	}
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {

		return current < end;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Integer next() {
		
		//check if no more elements are in range
		if(!hasNext()) throw new NoSuchElementException();
		//returns current Integer and moves to point the next one 
		return current++;
	}

}
