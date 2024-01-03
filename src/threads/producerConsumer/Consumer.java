package src.threads.producerConsumer;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Consumer implements Runnable{

    ConcurrentLinkedDeque cars;
    int cap;

    Consumer(ConcurrentLinkedDeque cars,int cap){
        this.cars = cars;
        this.cap = cap;
    }
    @Override
    public void run() {
        while(true){
            synchronized (cars){
                if(cars.size()>0){
                    System.out.println("Car from Consumer"+" "+cars.size());
                    cars.remove();
                }
            }

        }


    }
}
