package iface1;


interface Interface{
    void method();
}

class MyClass implements Interface{
    @Override
    public void method() {
        System.out.println("Method - Interface implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        my.method();
    }

}
