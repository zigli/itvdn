package package15;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        BaseClass instanceUp = instance;
        instanceUp.method();

        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();
    }
}
