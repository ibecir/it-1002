package ba.edu.ibu.week13.livessession;

class MultithreadedCounterWithInterface implements Runnable {
    private int threadNumber;

    public MultithreadedCounterWithInterface(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + this.threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MultithreadedCounter extends Thread {
    private int threadNumber;

    public MultithreadedCounter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + this.threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MainRun {
    static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            MultithreadedCounter counter = new MultithreadedCounter(i);
            counter.start();
        }

        MultithreadedCounterWithInterface counterWithInterface = new MultithreadedCounterWithInterface(6);
        Thread thread = new Thread(counterWithInterface);
        thread.start();
    }
}
