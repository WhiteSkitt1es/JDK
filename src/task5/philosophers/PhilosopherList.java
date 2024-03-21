package task5.philosophers;

import java.util.ArrayList;

public class PhilosopherList {
    private final ArrayList<Philosopher> philosophers;

    public PhilosopherList() {
        philosophers = new ArrayList<>();
    }

    public void addPhilosopher(Philosopher philosopher) {
        philosophers.add(philosopher);
    }

    public int getSize() {
        return philosophers.size();
    }

    public Philosopher getPhilosopherByID (int index) {
        return philosophers.get(index);
    }
}
