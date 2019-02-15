package iface2;

public class Main {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.method1();
        derivedClass.method2();

        Interface1 instance1 = new DerivedClass();
        instance1.method1();

        Interface2 instance2 = new DerivedClass();
        instance2.method2();

    }
}
