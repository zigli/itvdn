package package13;

public class A {
    {
        System.out.println("In block1");
    }

    static {
        System.out.println("In static block1");
    }

    A(){
        System.out.println("In constructor Aa");
    }

    {
        System.out.println("In block2");
    }

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
    }
}
