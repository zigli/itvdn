package iface4;

interface Interface1{
    void method1();
}

interface Interface2 extends Interface1{
    void method2();
}

class ConcreteClass implements Interface2{
    @Override
    public void method1() {
        System.out.println("method1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("method2 from Interface2");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method1();
        instance.method2();

        Interface2 interface2 = new ConcreteClass();
        interface2.method2();
        interface2.method1();

        Interface1 interface1 = new ConcreteClass();
        interface1.method1();
    }
}
