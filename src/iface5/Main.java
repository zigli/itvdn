package iface5;

interface Interface1{
    void method();
}

interface Interface2{
    void method();
}

class ConcreteClass implements Interface1,Interface2 {
    @Override
    public void method() {
        System.out.println("method from interface(1-2)");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();

        Interface2 interface2 = new ConcreteClass();
        interface2.method();

        Interface1 interface1 = new ConcreteClass();
        interface1.method();
    }
}
