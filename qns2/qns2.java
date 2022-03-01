abstract class Shape{
    double dim1;
    double dim2;
    double PI;

    public Shape(double dim1, double dim2, double PI){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = PI;
    }
    public abstract double area();
}

class Triangle extends Shape{
    public Triangle(double dim1, double dim2){
        super(dim1,dim2,0);
    }
    public double area(){
        return this.dim1*this.dim2*0.5;
    }
}

class Circle extends Shape{
    public Circle(double dim1, double dim2){
        super(dim1,dim2,3.142);
    }
    public double area(){
        return this.dim1*this.dim2*this.PI;
    }
}

class Eclipse extends Shape{
    public Eclipse(double dim1, double dim2){
        super(dim1,dim2,3.142);
    }
    public double area(){
        return this.PI*this.dim2*this.dim2;
    }
}
class Rectangle extends Shape{

    public Rectangle(double dim1, double dim2){
        super(dim1, dim2,0);
    }

    public double area(){
        return this.dim1*this.dim2;
    }
}

class Square extends Shape{

    public Square(double dim1, double dim2){
        super(dim1, dim2,0);
    }

    public double area(){
        return this.dim1*this.dim2;
    }
}

public class qns2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(9, 5);
        Triangle tri = new Triangle(10, 8);
        Circle circ = new Circle(5, 5);
        Eclipse eclipse = new Eclipse(7,7);
        Square sq = new Square(6, 6);

        System.out.println("The area of Rectangle created is: " + rec.area());
        System.out.println("The area of Triangle created is: " + tri.area());
        System.out.println("The area of Circle created is: " + circ.area());
        System.out.println("The area of Eclipse created is: " + eclipse.area());
        System.out.println("The area of Square created is: " + sq.area());

    }
}
