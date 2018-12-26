package learning.java.java8;

public interface IDefaultMethodsExample {

    default public void someMethod(){
        System.out.println("from IDefaultMethodsExample...");
    }

    public void someMethod2();
}
