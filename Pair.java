package JavaDevelopmentKit.Lesson3.HW;

/*
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Pair<T, V> {
    Object object1 = new Object();
    Object object2 = new Object();

    public Pair(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public Object getFirst() {
        this.object1 = object1.getClass().getName();
        return object1;
    }

    public Object getSecond() {
        this.object2 = object2.getClass().getName();
        return object2;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(object1);
        sBuilder.append(" ");
        sBuilder.append(object2);
        return sBuilder.toString();
    }
}
