package HW1;

import java.util.ArrayList;
import java.util.List;

public class WorkWithBox {
    public static void main(String[] args) {
        BoxGeneric<Apple> box1 = new BoxGeneric<Apple>();
        BoxGeneric<Orange> box2 = new BoxGeneric<Orange>();
        BoxGeneric<Fruit> box3 = new BoxGeneric<Fruit>();
        box1.addFruit(new Apple(1.0f));
        box1.addFruit(new Apple(1.0f));
        box1.addFruit(new Apple(1.0f));
        box1.addFruit(new Apple(1.0f));
        box1.addFruit(new Apple(1.0f));
        box2.addFruit(new Orange(1.5f));
        box2.addFruit(new Orange(1.5f));
        box2.addFruit(new Orange(1.5f));
        box2.addFruit(new Orange(1.5f));
        box1.getWeightBox();
        box2.getWeightBox();
        System.out.println(box2.compare(box1));


    }
}
