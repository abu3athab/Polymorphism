public class Square extends Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calcArea() {
        return Math.pow(this.a,2);
    }

    @Override
    public String getShape() {
        return "Square";
    }
}
