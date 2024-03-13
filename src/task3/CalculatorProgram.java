package task3;

public class CalculatorProgram {
    public static void main(String[] args) {
        int intNum = 111;
        long longNum = 33333333L;
        float floatNum = 4.4444444f;
        double doubleNum = 5.5555555555;
        byte byteNum = -127;
        short shortNum = 22222;
        printResult(intNum, longNum, "+");
        printResult(longNum, floatNum, "*");
        printResult(floatNum, doubleNum, "/");
        printResult(doubleNum, intNum, "-");
        printResult(byteNum, shortNum, "/");
    }

    private static <T extends Number> void printResult(T t1, T t2, String operand) {
        String a = t1.toString();
        String b = t2.toString();
        String c = switch (operand) {
            case "+" -> Double.toString(Calculator.sum(t1, t2));
            case "*" -> Double.toString(Calculator.multiply(t1, t2));
            case "/" -> Double.toString(Calculator.divide(t1, t2));
            case "-" -> Double.toString(Calculator.subtract(t1, t2));
            default -> "";
        };
        System.out.printf("\n%s %s %s = %s\n", a, operand, b, c);
    }
}
