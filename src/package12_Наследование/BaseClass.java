package package12_Наследование;

public class BaseClass {

    public BaseClass(){

    }

    public String publicField = "BaseClass.publicField";
    private String privateField = "BaseClass.privateField";
    protected String protectedField = "BaseClass.protectedField";

    public void show(){
        System.out.println(privateField);
    }
}
