package circle;

public class Circle { // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
 private double radius;
 private String color;


 // Constructors (overloaded)
 /** Constructs a Circle instance with default value for radius and color */
 public Circle() { // 1st (default) constructor
 radius = 1.0;
 color = "red";
 }

 /** Constructs a Circle instance with the given radius and default color */
 public Circle(double r) { // 2nd constructor
 radius = r;
 color = "red";
 }
 
 public Circle(double r , String color){
     this.radius = r;
     this.color= color;
 }
 
 public void setColor(){
     this.color = color;
 }
 
 public String getColor(String color){
     return color;
 }

 /** Returns the radius */
 public double getRadius() {
 return radius;
 
 }
 
 public double getArea(){
     return radius*radius*Math.PI;
 }
/** Return a self-descriptive string of this instance in the form of
Circle[radius=?,color=?] */
 public String toString() {
 return "Circle[radius=" + radius + " color=" + color + "]";
 }
}
