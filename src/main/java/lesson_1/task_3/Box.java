package lesson_1.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box> {

    private ArrayList<T> fruit;

    public Box(T... fruits) {
        this.fruit = new ArrayList<>(Arrays.asList(fruits));
    }

    public Box(T fruits, int count) {
        this.fruit = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            fruit.add(fruits);
        }
    }
    public float getWeight() {
        float weight = 0.0f;
        for (Fruit f : fruit) {
            weight += f.getWeight();
        }
        return weight;
    }

    public void add(T... fruits){
        fruit.addAll(List.of(fruits));
    }

    public void info (){
        System.out.println(fruit.size());
    }

    public void pourItOver(Box <T> anotherBox){
        anotherBox.fruit.addAll(fruit);
        fruit.clear();
    }

    @Override
    public int compareTo(Box o) {
        return 0;
    }
}
