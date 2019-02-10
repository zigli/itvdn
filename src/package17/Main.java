package package17;

final class FinalClass{
    public int x;
    public int y;
}

public class Main {
    public static void main(String[] args) {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;

        System.out.println(instance.x + " : " + instance.y);
    }
}
