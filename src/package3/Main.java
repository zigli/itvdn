package package3;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Default values in class");
        System.out.println(shape.i);
        System.out.println(shape.b);
        System.out.println(shape.c);
        System.out.println(shape.f);

        System.out.println(shape);

        System.out.println("============================");

        shape.square = 24;
        System.out.println(shape.square);

        shape.setHeight(200);
        System.out.println(shape.getHeight());

        shape.viewShape();

        shape.setLength(133);
        System.out.println(shape.getLength());

        shape.viewShape();

    }
}
