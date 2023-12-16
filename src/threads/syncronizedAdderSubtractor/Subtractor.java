package src.threads.syncronizedAdderSubtractor;

import src.threads.adderSubstractor.Count;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for (int i=1;i<=100000000;i++){
            synchronized (count){
                count.value -=i;
            }

        }
    }
}
