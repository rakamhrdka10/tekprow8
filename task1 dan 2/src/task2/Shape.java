package task2;
public class Shape {
private String color ;
private boolean filled;
    
 public Shape() { // 1st (default) constructor
 filled = true;
 color = "red";
 }
 public Shape(String color , boolean filled){
     super();
     this.filled = filled;
     this.color= color;
 }
  public void setColor(String color){
     this.color = color;
 }
 public String getColor(){
     return color;
 }
 public boolean isFilled(){
     return filled;
 }
 
 public void setFilled(boolean filled){
     this.filled=filled;
 }
  public String toString() {
 return "Shape[filled=" + filled + " color=" + color + "]";
 }
}


