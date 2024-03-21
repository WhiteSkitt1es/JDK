package task5.philosophers;

public class Philosopher {

    private final String name;
    private int count;
    private boolean isJustTakeFood;

    public Philosopher(String name) {
        this.name = name;
        count = 1;
        isJustTakeFood = false;
    }

    public String getName() {
        return name;
    }

    public String takesFood() {
        count++;
        isJustTakeFood = true;
        return " кушает спагетти " + (count - 1) + " раз";
    }

    public int getCount() {
        return count;
    }

    public String philosophize() {
        isJustTakeFood = false;
        return " размышляет";
    }

    public boolean getIsJustTakeFood() {
        return isJustTakeFood;
    }

    @Override
    public String toString() {
        return "Философ по имени " + name;
    }

}
