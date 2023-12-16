package src.threads.printnumber;

public class Numbers implements Runnable{
    int number;
    Numbers(int n){
        this.number = n;
    }


    @Override
    public void run() {
        System.out.println("Numbers Prints"+" "+this.number +" "+ Thread.currentThread().getName());
    }
}
