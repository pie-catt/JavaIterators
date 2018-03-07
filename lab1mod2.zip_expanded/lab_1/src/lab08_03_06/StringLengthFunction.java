package lab08_03_06;

import java.util.function.Function;

public class StringLengthFunction implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		return t.length();
	}

	
	
}
