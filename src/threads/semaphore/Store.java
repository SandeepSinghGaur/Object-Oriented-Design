package src.threads.semaphore;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Store {
    public static void main(String[] args) {

        ConcurrentLinkedDeque<Car> car = new ConcurrentLinkedDeque<>();

        Semaphore ps = new Semaphore(6);
        Semaphore cs = new Semaphore(8);

        Producer p1 = new Producer(car,6,ps,cs);
        Producer p2 = new Producer(car,6,ps,cs);
        Producer p3 = new Producer(car,6,ps,cs);
        Producer p4 = new Producer(car,6,ps,cs);
        Producer p5 = new Producer(car,6,ps,cs);
        Producer p6 = new Producer(car,6,ps,cs);
        Producer p7 = new Producer(car,6,ps,cs);
        Producer p8 = new Producer(car,6,ps,cs);

        Consumer c1 = new Consumer(car,6,ps,cs);
        Consumer c2 = new Consumer(car,6,ps,cs);
        Consumer c3 = new Consumer(car,6,ps,cs);
        Consumer c4 = new Consumer(car,6,ps,cs);
        Consumer c5 = new Consumer(car,6,ps,cs);
        Consumer c6 = new Consumer(car,6,ps,cs);
        Consumer c7 = new Consumer(car,7,ps,cs);

        Thread tp1 = new Thread(p1);
        Thread tp2 = new Thread(p2);
        Thread tp3 = new Thread(p3);
        Thread tp4 = new Thread(p4);
        Thread tp5 = new Thread(p5);
        Thread tp6 = new Thread(p6);
        Thread tp7 = new Thread(p7);
        Thread tp8 = new Thread(p8);

        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        Thread tc3 = new Thread(c3);
        Thread tc4 = new Thread(c4);
        Thread tc5 = new Thread(c5);
        Thread tc6 = new Thread(c6);
        Thread tc7 = new Thread(c7);

        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();
        tp6.start();
        tp7.start();
        tp8.start();

        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
        tc6.start();
        tc7.start();

//        tp1.run();
//        tp2.run();
//        tp3.run();
//        tp4.run();
//        tp5.run();
//        tp6.run();
//        tp7.run();
//        tp8.run();
//
//        tc1.run();
//        tc2.run();
//        tc3.run();
//        tc4.run();
//        tc5.run();
//        tc6.run();
//        tc7.run();

    }

}
