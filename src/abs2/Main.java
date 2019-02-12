package abs2;

abstract class AbstractClassA{
    public abstract void operationA();
}

abstract class AbstractClassb extends AbstractClassA{
    public abstract void operationB();
}

class ConcreteClass extends AbstractClassb{
    @Override
    public void operationA() {
        System.out.println("Concrete.operationA");
    }

    @Override
    public void operationB() {
        System.out.println("Concrete.operationB");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClassA instance = new ConcreteClass();
        instance.operationA();
        ((ConcreteClass) instance).operationB();

        ConcreteClass instance1 = new ConcreteClass();
        instance1.operationA();
        instance1.operationB();

    }
}
