package abs1;

class ConcreteClassA{
    public void operation(){
        System.out.println("ConcreteClassA.operation");
    }
}

abstract class AbstractClass extends ConcreteClassA{
    public abstract void method();
}

class ConcreteClassS extends AbstractClass{
    @Override
    public void method() {
        System.out.println("ConcreteClassS.method");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClassS();

        instance.method();
        instance.operation();
    }
}
