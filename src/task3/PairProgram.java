package task3;

import java.util.Date;
public class PairProgram {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        String person = "Ivan Ivanov";
        int age = 25;
        Pair<String, Integer> person_age = new Pair<>(person, age);
        System.out.println("Имя: " + person_age.first());
        System.out.println("Возраст: " + person_age.second());
        System.out.println(person_age);
    }

    private static void test2() {
        Date date = new Date();
        int hashCode = date.hashCode();
        Pair<Integer, Date> hashOfDate = new Pair<>(hashCode, date);
        System.out.println("Дата: " + hashOfDate.second());
        System.out.println("Хэш: " + hashOfDate.first());
        System.out.println(hashOfDate);
    }
}
