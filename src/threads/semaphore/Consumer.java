package src.threads.semaphore;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    ConcurrentLinkedDeque cars;
    int cap;
    Semaphore ps;
    Semaphore cs;

    Consumer(ConcurrentLinkedDeque cars, int cap, Semaphore ps, Semaphore cs){
        this.cars = cars;
        this.cap = cap;
        this.ps = ps;
        this.cs = cs;
    }
    @Override
    public void run() {
        while(true){
            try {
                cs.acquire();
                if(cars.size()>0){
                    System.out.println("Car from Consumer"+" "+cars.size());
                    cars.remove();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                ps.release();
            }

        }


    }
}
