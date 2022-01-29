package lesson_1.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TransformationInArrayList<T>{

    private T[] obj;

    public TransformationInArrayList(T[] obj) {
        this.obj = obj;
    }

    public List<T> start(){

        ArrayList<T> list = new ArrayList<>(Arrays.asList(obj));
        Collections.addAll(list);

        return List.of(obj);
    }

}
