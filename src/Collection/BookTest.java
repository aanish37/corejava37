package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book t = new Book();
		t.setName("Anish");
		t.setPrice(12999);
		List<Book> BookList = new ArrayList<>();
		BookList.add(t);
		for(Book c1 : BookList) {
			System.out.println(c1);
			
		}
		
		
		
	}

}
