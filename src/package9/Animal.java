package package9;

public class Animal {
    private int age;
    private  int height;

    public Animal(){
        this(16,66);
    }

//    public Animal(int age){   /// Нельзя... типы и кол-во параметров одинаковые
//        this(age,78);
//    }

    public Animal(int height){
        this(21,height);
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
