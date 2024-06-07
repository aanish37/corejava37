package OoPsquestionPractice;
public class Area {
    // Properties
    double length;
    double breadth;

    // Method to set dimensions
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area
    public double getArea() {
        return length * breadth;
    }
/*
 * package assignment;

public class Area {

	int l;
	int b;

	void setDim(int len, int brd) {
		l = len;
		b = brd;
	}

	void getArea() {

		int ar = l * b;
		System.out.println("Area = " + ar);
	}
	
	public static void main(String[] args) {
		Area  a = new Area();
		
		a.setDim(33, 87);
		a.getArea();
	}

}
 */
}
