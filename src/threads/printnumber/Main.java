package src.threads.printnumber;

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            Numbers n = new Numbers(i);
            Thread t = new Thread(n);
            t.start();

        }
    }
}
