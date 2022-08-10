public class Circle extends Shape{
    private double  radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calcArea() {
        return (Math.pow(this.radius,2))*(Math.PI);
    }

    @Override
    public String getShape() {
        return "Circle";
    }
}
