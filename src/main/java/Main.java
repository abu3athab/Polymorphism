import java.util.ArrayList;

public class Main {
    public static void main(String  []args){
        ArrayList<Shape>shapes=new ArrayList<>();
        shapes.add(new Circle(2.5));
        shapes.add(new Square(5));
        shapes.add(new Triangle(4.5,6));
        shapes.add(new Circle(3.25));
        shapes.add(new Triangle(5,7));
    for(Shape s:shapes)
        System.out.println("The area of the "+s.getShape()+" : "+s.calcArea());
    }
}
