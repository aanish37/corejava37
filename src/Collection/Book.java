package Collection;

public class Book {
	String Name;
	int Price;
	String AuthorName;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}	
	@Override
	public String toString() {
		return "Book [Name=" + Name + ", Price=" + Price + ", AuthorName=" + AuthorName + "]";
	}
}
