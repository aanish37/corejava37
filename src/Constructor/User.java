package Constructor;

public class User {
	String userName;
	String passWord;
	
	//--------------default constructor--------------------
	/*
	 * 	User(){
		userName = "root";
		passWord = "123";
	}
	 */
	
	//-----------------------parameterized constructor-------------------------
	//1. usage
	User(String user_name, String password){
		//this(); //default constructor
		//this(3434,34343,); // parameterized constructor  constructorOverloading/ multiple constructor
		this.userName = user_name;
		this.passWord = password;
		/*
		 * -> 'this'keyword represents current object.
		 * -> we can call following using 'this' :
		 *   a> instance variables
		 *   b> instance methods
		 *   c> constructors
		 */
	}
	
	void printUser() {
		System.out.println("UserName ="+userName);
		System.out.println("Password ="+passWord);
	}
	
	public static void main(String[] args) {
		User u = new User("ram", "2434243" );
		u.printUser();
	}

}
