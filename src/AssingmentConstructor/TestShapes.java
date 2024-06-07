package AssingmentConstructor;

public class TestShapes {
    public static void main(String[] args) {
        // TriangleNoParams
        Shapes.TriangleNoParams triangleNoParams = new Shapes.TriangleNoParams();
        System.out.println("TriangleNoParams - Perimeter: " + triangleNoParams.getPerimeter());
        System.out.println("TriangleNoParams - Area: " + triangleNoParams.getArea());

        // TriangleWithParams
        Shapes.TriangleWithParams triangleWithParams = new Shapes.TriangleWithParams(3, 4, 5);
        System.out.println("TriangleWithParams - Perimeter: " + triangleWithParams.getPerimeter());
        System.out.println("TriangleWithParams - Area: " + triangleWithParams.getArea());

        // Rectangle
        Shapes.Rectangle rectangle1 = new Shapes.Rectangle(4, 5);
        Shapes.Rectangle rectangle2 = new Shapes.Rectangle(5, 8);
        System.out.println("Rectangle 1 - Area: " + rectangle1.getArea());
        System.out.println("Rectangle 2 - Area: " + rectangle2.getArea());
    }
}
