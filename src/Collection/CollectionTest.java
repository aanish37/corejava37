package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(34,45,67,23,12,56,78,98,69,60);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
