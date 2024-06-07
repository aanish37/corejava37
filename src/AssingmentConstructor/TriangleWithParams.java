package AssingmentConstructor;

public class TriangleWithParams {
    private int a, b, c;

    public TriangleWithParams(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        TriangleWithParams triangle = new TriangleWithParams(3, 4, 5);
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
        System.out.println("Area of the triangle: " + triangle.getArea());
    }
}
