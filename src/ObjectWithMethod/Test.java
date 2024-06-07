package ObjectWithMethod;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
    
        Test t = new Test();
        Product pd = t.getProductData();
        t.printProduct(pd);
						
	}
	
	//---------------object as a parameter----------------------
	
	void printProduct(Product p) {
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getCompany());
	}
	
	//---------------------object as return type---------------------
	Product getProductData() {
		
		Scanner sc = new Scanner (System.in);
        Product p = new Product();
        p.setId(1);
        p.setName(sc.next());
        p.setPrice(1500);
        p.setCompany("TechCo");
        
        return p;
        
        /*
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        // Create an array of Product objects
        Product[] products = new Product[3];
        products[0] = t.getProductData(1);
        products[1] = t.getProductData(2);
        products[2] = t.getProductData(3);

        // Print all products in the array
        t.printProducts(products);
    }

    // Method to print a single product's details
    void printProduct(Product p) {
        System.out.println("Id = " + p.getId());
        System.out.println("Name = " + p.getName());
        System.out.println("Price = " + p.getPrice());
        System.out.println("Company = " + p.getCompany());
    }

    // Method to get product data from user
    Product getProductData(int id) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        p.setId(id);
        System.out.print("Enter product name for ID " + id + ": ");
        p.setName(sc.next());
        System.out.print("Enter price for ID " + id + ": ");
        p.setPrice(sc.nextInt());
        System.out.print("Enter company for ID " + id + ": ");
        p.setCompany(sc.next());

        return p;
    }

    // Method to print details of all products in an array
    void printProducts(Product[] products) {
        for (Product p : products) {
            printProduct(p);
            System.out.println(); // Add an empty line between products
        }
    }
}

         */
        
        
        /*
         * package ObjectWithMethod;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        // Get an array of Product objects
        Product[] products = t.getProducts();

        // Print all products in the array
        t.printProducts(products);
    }

    // Method to print a single product's details
    void printProduct(Product p) {
        System.out.println("Id = " + p.getId());
        System.out.println("Name = " + p.getName());
        System.out.println("Price = " + p.getPrice());
        System.out.println("Company = " + p.getCompany());
    }

    // Method to get product data from user
    Product getProductData(int id) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        p.setId(id);
        System.out.print("Enter product name for ID " + id + ": ");
        p.setName(sc.next());
        System.out.print("Enter price for ID " + id + ": ");
        p.setPrice(sc.nextInt());
        System.out.print("Enter company for ID " + id + ": ");
        p.setCompany(sc.next());

        return p;
    }

    // Method to print details of all products in an array
    void printProducts(Product[] products) {
        for (Product p : products) {
            printProduct(p);
            System.out.println(); // Add an empty line between products
        }
    }

    // Method to create and return an array of Product objects
    Product[] getProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numOfProducts = sc.nextInt();

        Product[] products = new Product[numOfProducts];
        for (int i = 0; i < numOfProducts; i++) {
            products[i] = getProductData(i + 1);
        }

        return products;
    }
}

         */
		
	}
	
	//-------------array of object as a parameter -------------------
	//-------------array of object as a return type------------------
	

}
