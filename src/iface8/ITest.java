package iface8;

//interface cannot be final
public interface ITest {
    public static final int PRICE = 10;
    public abstract void move();

    static int sum(){
        return 5 + 10;
    }

    default int mult(){
        return 5 * 10;
    }
}
