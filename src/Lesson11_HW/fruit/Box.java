package Lesson11_HW.fruit;



import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }

    public List<T> get() {
        return fruits;
    }

    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0F;
    }

    public boolean compare(Box<? extends Fruit> other) {
        return other.getWeight() == getWeight();
    }

    public void merge(Box<T> other) {
        getFruits().addAll(other.getFruits());
        other.getFruits().clear();
    }


}
