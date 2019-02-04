package package8;

public class Animal {
    private int age;
    private  int height;

    public Animal(){
        this.age = 14;
        this.height = 100;
    }

    public Animal(int age){
        this.age = age;
        this.height = 133;
    }

    public Animal(int age, int height){
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
