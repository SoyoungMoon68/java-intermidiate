package lang.object.equals;

import lang.object.tostring.Dog;

public class EqualsDogApp {
    public static void main(String[] args) {
        Dog milky = new Dog("Milky", 13);
        Dog youngMilky = new Dog("Milky", 5);

        System.out.println("milky.equals(youngMilky) = " + milky.equals(youngMilky));
    }
}
