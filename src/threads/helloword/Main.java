package src.threads.helloword;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World Thread "+ " "+Thread.currentThread().getName());
        PrintHelloWorld printHelloWorld = new PrintHelloWorld();
        Thread t = new Thread(printHelloWorld);
        t.start();
    }
}
