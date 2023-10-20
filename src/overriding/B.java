package src.overriding;

public class B extends A{
    public void doSomething() {
        super.doSomething();
        System.out.println("Class B Method Called");
    }
}
