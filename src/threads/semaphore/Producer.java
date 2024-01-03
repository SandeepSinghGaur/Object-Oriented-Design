package src.threads.semaphore;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    ConcurrentLinkedDeque cars;
    int cap;
    Semaphore ps;
    Semaphore cs;

    Producer(ConcurrentLinkedDeque car, int cap, Semaphore ps,Semaphore cs){
        this.cap = cap;
        this.cars = car;
        this.ps = ps;
        this.cs = cs;

    }
    @Override
    public void run() {
        while(true){
            try {
                ps.acquire();
                if(cars.size()<cap){
                    System.out.println("Producer from Consumer"+" "+cars.size());
                    cars.add(new Car("Audi","BH02KA2712"));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                cs.release();
            }



        }


    }
}
