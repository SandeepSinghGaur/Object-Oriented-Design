package src.threads.excecutorFramework.printNumber;

public class Numbers implements Runnable{

    int i;
    public Numbers(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
