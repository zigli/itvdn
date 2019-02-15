package iface3;

public class Main {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.method();
        derivedClass.method1();

        BaseClass instance0 = new DerivedClass();
        instance0.method();
        ((DerivedClass) instance0).method1();
        ((DerivedClass) instance0).method2();

        Interface1 interface1 = new DerivedClass();
        interface1.method1();
        ((DerivedClass) interface1).method();
        ((DerivedClass) interface1).method2();

        Interface2 interface2 = new DerivedClass();
        interface2.method2();
        ((DerivedClass) interface2).method();
        ((DerivedClass) interface2).method1();


        BaseClass baseClass = (BaseClass) derivedClass;
        baseClass.method();

        Interface1 interface11 = (Interface1) derivedClass;
        interface11.method1();

        Interface2 interface21 = (Interface2) derivedClass;
        interface21.method2();

    }
}
