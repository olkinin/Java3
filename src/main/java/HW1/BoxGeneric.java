package HW1;

import java.util.ArrayList;

public class BoxGeneric<T extends Fruit> {
    ArrayList<T> fruits;
    int counter = 0;

    public BoxGeneric() {
        fruits = new ArrayList<T>();

    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }


    public float getWeightBox() {
        float weightBox = 0f;
        for (T fruit : fruits) {
            weightBox = weightBox + fruit.getWeight();
        }
      return weightBox;
    }

    public boolean compare(BoxGeneric<? extends Fruit> another) {
        return this.getWeightBox()==another.getWeightBox();

    }
}




