package iface6;

interface Interface{
    void method();
}

abstract class AbstractClass implements Interface{
    @Override
    public void method() {
        System.out.println("method implemented in Abstract class");
    }
}

class ConcreteClass extends AbstractClass {
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
