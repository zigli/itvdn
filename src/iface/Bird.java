package iface;

public abstract class Bird implements Creator{
    @Override
    public void live() {
        System.out.println("I can live");
    }

    public abstract void move();
    public void eat(){
        System.out.println("I can eat");
    }
}
