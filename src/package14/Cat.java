package package14;

public class Cat extends Animal {
    int age;
    String name;

    Cat(int age,String name,int weight,String brade){
        super(weight,brade);
        this.age=age;
        this.name=name;
    }
}
