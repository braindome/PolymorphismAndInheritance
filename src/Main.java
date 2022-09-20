import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Lion lion1 = new Lion("Simba");
        Lion lion2 = new Lion("Mufasa");

        Hyena hyena1 = new Hyena("Sephiroth");
        Hyena hyena2 = new Hyena("Satan");

        ArrayList<Animal> savanaPop = new ArrayList<>();

        savanaPop.add(lion1);
        savanaPop.add(lion2);
        savanaPop.add(hyena1);
        savanaPop.add(hyena2);

        for (Animal a : savanaPop) {
            System.out.println("Name: " + a.getName());
        }

        System.out.println(hyena1.getName() + hyena2.attack() + lion1.getName());*/

        Triangle triangle1 = new Triangle(3.0, 2.0);
        Triangle triangle2 = new Triangle(5.0, 6.0);
        Rectangle rectangle1 = new Rectangle(10.0, 3.0);
        Rectangle rectangle2 = new Rectangle(2.0, 3.0);


        System.out.println("Area: " + triangle1.getArea());
        System.out.println("Area: " + triangle2.getArea());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Area: " + rectangle2.getArea());
    }
}