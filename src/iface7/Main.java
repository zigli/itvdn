package iface7;

interface Interface{
    public abstract void method();
}

class BaseClass{
    public void method(){
        System.out.println("Method from BaseClass");
    }
}

class DerivedClass extends BaseClass implements Interface{

}

public class Main {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.method();

        BaseClass instance = (BaseClass) derivedClass;
        instance.method();

        Interface instance1 = (Interface) derivedClass;
        instance1.method();
    }
}
