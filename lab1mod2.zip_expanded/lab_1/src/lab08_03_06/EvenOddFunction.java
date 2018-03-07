package lab08_03_06;

import java.util.function.Function;

public class EvenOddFunction implements Function<String, Boolean> {

	@Override
	public Boolean apply(String t) {
		return t.length() % 2 == 0;
	}
	
	
	

}
