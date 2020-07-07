package program;

public class Rectangle extends Shape{

    void draw(){
        System.out.println("Drawing the rectangle");
    }

    public static void main(String[] args) {

        Shape rec = new Rectangle();
        rec.draw();
    }
}
