package AssingmentConstructor;

public class TriangleNoParams {
    private int a, b, c;

    public TriangleNoParams() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        TriangleNoParams triangle = new TriangleNoParams();
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
        System.out.println("Area of the triangle: " + triangle.getArea());
    }
}

