package task3;

public class Calculator {
    public static <T1 extends Number, T2 extends Number> double sum (T1 t1, T2 t2) {
        return Double.sum(Double.parseDouble(t1.toString())
                , Double.parseDouble(t2.toString()));
    }

    public static <T1 extends Number, T2 extends Number> double multiply (T1 t1, T2 t2) {
        return Double.parseDouble(t1.toString())
                * Double.parseDouble(t2.toString());
    }

    public static <T1 extends Number, T2 extends Number> double divide (T1 t1, T2 t2) {
        return Double.parseDouble(t1.toString())
                / Double.parseDouble(t2.toString());
    }

    public static <T1 extends Number, T2 extends Number> double subtract (T1 t1, T2 t2) {
        return Double.parseDouble(t1.toString())
                - Double.parseDouble(t2.toString());
    }
}
