public class Triangle extends Shapes{


    public Triangle(double width, double height) {
        super(width, height);

    }

   @Override
    public double getArea() {
        return (getWidth() * getWidth())*0.5;
    }
}
