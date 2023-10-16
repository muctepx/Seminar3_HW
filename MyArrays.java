package JavaDevelopmentKit.Lesson3.HW;

/*
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
 */
public class MyArrays<T> {
    Object[] objects = new Object[3];
    Object[] objects1 = new Object[3];

    public boolean acompareArrays() {
        if (objects == objects1) {
            return true;
        }
        return false;

    }
}
