package task5.forks;

public class Fork {
    private final String name;
    private int count;
    private boolean isUsed;

    public Fork(String name) {
        this.name = name;
        count = 1;
        isUsed = false;
    }

    public boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public String getName() {
        return name + " (использована " + (count++) + " раз/раза)";
    }
}
