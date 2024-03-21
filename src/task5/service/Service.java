package task5.service;

import task5.forks.Fork;
import task5.philosophers.Philosopher;
import task5.table.Table;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Service {
    private final Table table;
    private final int count;
    private final int tableSize;
    private final CountDownLatch latch;

    public Service() {
        table = new Table();
        count = 3;
        tableSize = table.getPhilosopherList().getSize();
        latch = new CountDownLatch(tableSize);
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < tableSize; i++) {
            Thread thread = new Thread(createRunnable(i));
            thread.start();
        }
        latch.await();
    }

    private Runnable createRunnable(int i) {
        return () -> {
            Philosopher philosopher = table.getPhilosopherList().getPhilosopherByID(i);
            Fork forkLeft = getForks(i, tableSize)[0];
            Fork forkRight = getForks(i, tableSize)[1];
            latch.countDown();
            while (philosopher.getCount() <= count) {
                try {
                    tryToEat(philosopher, forkLeft, forkRight);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    private Fork[] getForks (int i, int size) {
        return new Fork[] {table.getForksList().getForkByIndex(i)
                , table.getForksList().getForkByIndex((size + 1 + i)%size)};
    }

    private void tryToEat(Philosopher philosopher, Fork forkLeft, Fork forkRight) throws InterruptedException {
        if (isForksFree(philosopher, forkLeft, forkRight)) {
            String string = philosopher.getName() + philosopher.takesFood()
                    + " вилками:  " + forkLeft.getName() + " и " + forkRight.getName();
            System.out.println(string);
            Thread.sleep(new Random().nextLong(1000, 5000));
            forkLeft.setIsUsed(false);
            forkRight.setIsUsed(false);
        } else {
            System.out.println(philosopher.getName() + philosopher.philosophize());
            Thread.sleep(new Random().nextLong(2000, 4000));
        }
    }

    private synchronized boolean isForksFree(Philosopher philosopher, Fork forkLeft, Fork forkRight) {
        if (!forkLeft.getIsUsed() && !forkRight.getIsUsed() && !philosopher.getIsJustTakeFood()) {
            forkLeft.setIsUsed(true);
            forkRight.setIsUsed(true);
            return true;
        }
        return false;
    }

}
