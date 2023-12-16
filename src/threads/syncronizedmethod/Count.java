package src.threads.syncronizedmethod;

public class Count {

    private int value = 0;

    public int getValue(){
        return this.value;
    }

    public synchronized void incrementValue(int i){
        this.value+=i;
    }
}
