package task2;
public class Square extends Rectangle {
    public Square (){
        super();
    }
    public Square (double side){
        super(side,side);
    }
    public Square (double side, String color, boolean filled){
     super(side, side, color, filled);
    }
    public void setWidht(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }
    
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    public String toString(){
     return " A square with side = "+ getSide()+", which is a subclass of" + super.toString();
    }
}
