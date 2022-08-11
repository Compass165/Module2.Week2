import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit[] = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit e : fruit ) {
            System.out.println(e.howToEat());
        }
    }


}
