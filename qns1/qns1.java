import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class GeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        this.color = "White";
        this.filled = false;
        java.util.Date date = new java.util.Date();
        this.dateCreated = date;
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return this.dateCreated;
    }
    public String toString(){
        return "abc";
    }
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        this.radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.142;
    }
    public double getPerimeter(){
        return 2*this.radius*3.142;
    }
    public double getDiameter(){
        return 2*this.radius;
    }
    public void printCircle(){

    }
}

class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, boolean filled){
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
}