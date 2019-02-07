package package14;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(3,"Marsel", 6, "Shynx");
        Cat c1 = new Cat(5,"Bars", 5, "Cool");

        System.out.println(c.age + c.name + c.getWeight() + c.getBrade());
        System.out.println(c1.age + c1.name + c1.getWeight() + c1.getBrade());

    }
}
