package task5.forks;

import java.util.ArrayList;

public class ForksList {

    private final ArrayList<Fork> forks;

    public ForksList() {
        forks = new ArrayList<>();
    }

    public void addFork(Fork fork) {
        forks.add(fork);
    }


    public Fork getForkByIndex(int index) {
        return forks.get(index);
    }
}
