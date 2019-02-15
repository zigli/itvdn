package iface3;

public class DerivedClass extends BaseClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method2 implementation");
    }
}
