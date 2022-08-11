import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import ediable.Ediable;

public class Test {

    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal e: animals) {
            System.out.println(e.makeSound());

            if (e instanceof Animal) {
                Ediable ediabler = (Animal) e;
                System.out.println(ediabler.howToEat());
            }
        }
    }

}

