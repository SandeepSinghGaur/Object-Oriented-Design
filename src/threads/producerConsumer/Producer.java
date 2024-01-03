package src.threads.producerConsumer;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Producer implements Runnable{

    ConcurrentLinkedDeque cars;
    int cap;

    Producer(ConcurrentLinkedDeque car,int cap){
        this.cap = cap;
        this.cars = car;

    }
    @Override
    public void run() {
        while(true){
            synchronized (cars){
                if(cars.size()<cap){
                    System.out.println("Producer from Consumer"+" "+cars.size());
                    cars.add(new Car("Audi","BH02KA2712"));
                }
            }

        }


    }
}
