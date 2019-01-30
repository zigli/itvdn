package package3;

public class Shape {
    private int length;
    private  int height;
    public double square;
    public float f;
    public char c;
    public boolean b;
    public int i;

    Shape(){
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void viewShape(){
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }
}
