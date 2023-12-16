package src.threads.syncronizedmethod;


public class Adder implements Runnable{
    Count count;
    Adder(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1;i<=100000000;i++){
           count.incrementValue(i);

        }
    }
}
