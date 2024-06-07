package Methodtestques;

public class areaandvolume {
	public static void main(String[] args) {
		int area = getArea(50,60);
		 volume(area,90);
		
	}
	
	static int getArea(int l , int b) {
		int area = l * b;
		return area;
	}
	
	static void volume( int area, int h) {
		int volume = area * h;
		System.out.println( area);
		System.out.println( volume);
	}
	

}
