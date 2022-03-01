public class TestCircleRectangle {
    public static void main(String[] args) {

        Circle circle = new Circle(2);
        System.out.println("The color is created on " + circle.getDateCreated());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The color is " + circle.isFilled());
        System.out.println("This radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("The color is created on " + rectangle.getDateCreated());
        System.out.println("The color is " + rectangle.getColor());
        System.out.println("The color is " + rectangle.isFilled());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The area is " + rectangle.getPerimeter());
    }
}
