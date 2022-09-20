public class Lion extends Animal {
    String name;

    public Lion(String name) {
        super(name);
    }

    public void roar() {
        System.out.println(name + "roar!");
    }
}
