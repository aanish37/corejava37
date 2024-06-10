package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		//subject - marks
		
		//Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("English", 80);
		map.put("Math", 90);
		map.put("Physics", 90);
		map.put("Computer", 100);
		System.out.println(map.keySet());
		System.out.println();
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
		
		Map<String, List<Integer> > mlist = new LinkedHashMap<>();
		mlist.put("Maths", List.of(55,66,88));
		mlist.put("Science", List.of(55,66,88));
		mlist.put("Nepali", List.of(55,66,88));
		
		for(String key : mlist.keySet()) {
			System.out.println(key+" = "+mlist.get(key));
		}
		

		
		
		
		
				
   }

}
