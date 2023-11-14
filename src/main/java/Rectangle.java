//Rectangle class
public class Rectangle {

//    Rectangle properties
    private int length;
    private int width;

//  Rectangle constructor
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }
//  Method to calculate area of rectangle
    public int calculateArea(){
        return this.length * this.width;
    }
//  Method to determine whether rectangle is a square
    public Boolean isSquare(){
        return this.length == this.width;
    }
}
