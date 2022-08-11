package animal;

import ediable.Ediable;

public class Tiger extends Animal{

    @Override
    public String makeSound() {
        return "Tiger: roarrrrrrr!";
    }

    @Override
    public String howToEat() {
        return "Cant eat";
    }
}
