package lesson_1.task_1;

public class SwapPlaces<T> {
    //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

    private T[] obj;


    public SwapPlaces(T[] obj) {
        this.obj = obj;
    }

    public T[] run(int a, int b){
        T tmp;
        tmp = obj[a];
        obj[a] = obj[b];
        obj[b] = tmp;
        System.out.println("Результат замены");
        for (T t : obj) System.out.println(t);

        return obj;
    }
}
