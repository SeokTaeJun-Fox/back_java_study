package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class streamTestEx {
	public static void main(String[] args) {
		IntStream a = IntStream.range(0, 20);
		a.boxed();
	}
}
