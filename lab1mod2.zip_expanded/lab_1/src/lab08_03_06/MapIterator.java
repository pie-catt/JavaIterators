package lab08_03_06;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;
import static java.util.Objects.requireNonNull;

class MapIterator<A, B> implements Iterator<B> {

	private final Function<A, B> fun; // funzione da A a B: fun.apply(x) corrisponde a fun(x)
	private final Iterator<A> it;

	public MapIterator(Function<A, B> fun, Iterator<A> it) {
	   
		//check if @param fun is not null
		this.fun = requireNonNull(fun);
		//check if @param it is not null
		this.it = requireNonNull(it);
				
	}

	@Override
	public boolean hasNext() {
		
		return it.hasNext();
	
	}

	@Override
	public B next() {
	
		//check if Iterator has a next element
		if (!it.hasNext()) throw new NoSuchElementException();
		//apply the function and returns the result\
		return fun.apply(it.next());	
	
	}

}
