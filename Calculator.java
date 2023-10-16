package JavaDevelopmentKit.Lesson3.HW;

/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа (но необязательно разного между собой), над которыми должна быть произведена операция.
*/
public class Calculator<T> {
    T num1;
    T num2;

    public static void main(String[] args) {
        int a = 10;
        double b = 2.0;

        System.out.println(sum(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(subtract(a, b));
    }

    public static <T extends Number> T sum(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        }
    }

    public static <T extends Number> T multiply(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        }
    }

    public static <T extends Number> T divide(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
        } else {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        }
    }

    public static <T extends Number> T subtract(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        }
    }

}
