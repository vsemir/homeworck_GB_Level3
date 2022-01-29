package lesson_1;

import lesson_1.task_1.SwapPlaces;
import lesson_1.task_2.TransformationInArrayList;

public class Main {
    public static void main(String[] args) {

        String[] arr = new String[]{"1","2","3","4","5"};

        SwapPlaces <String> task1 = new SwapPlaces<>(arr);
        task1.run(1,4);


        TransformationInArrayList<String> transformationInArrayList = new TransformationInArrayList<>(arr);

        System.out.println(transformationInArrayList.start());




    }
}
