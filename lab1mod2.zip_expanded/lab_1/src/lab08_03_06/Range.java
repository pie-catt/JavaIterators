package lab08_03_06;

import java.util.Iterator;

/**
 * Class representing ranges of Integer numbers
 * 
 * @author Pietro Cattaneo
 *
 */
public class Range implements Iterable<Integer> {


	private final int start;
	private final int end;
	
	/**
	 * Creates a Range of Integer between start (included) and end
	 * 
	 * @param start the first included number
	 * @param end the last number of the Range 
	 */
	public Range(int start, int end){
		
		this.start = start;
		this.end = end;
				
	}
	
	/**
	 * Creates a Range of Integer between 0 (included) and end
	 * 
	 * @param end the last number of the Range
	 */
	public Range(int end){
		
		this.start = 0;
		this.end = end;
				
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Integer> iterator() {
		return new RangeIterator(start, end);
	}

}
