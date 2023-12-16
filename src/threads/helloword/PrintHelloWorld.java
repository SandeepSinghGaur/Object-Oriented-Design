package src.threads.helloword;

public class PrintHelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World Thread run "+ " "+Thread.currentThread().getName());
        System.out.println("Hello World");
    }
}
