public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(name + "eating " + food);

    }

    public String getName() {
        return name;
    }

    public String attack() {
        return " bites ";
    }
}
