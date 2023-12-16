package src.threads.syncronizedmethod;


public class Subtractor implements Runnable{
    Count count;
    Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for (int i=1;i<=100000000;i++){
             count.incrementValue(-i);
        }
    }
}
