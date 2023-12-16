package src.threads.excecutorFramework.printNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=1;i<=100;i++){
            Numbers n = new Numbers(i);
            executorService.submit(n);
        }
        executorService.shutdown();
    }
}
