package package8;

public class Main {
    public static void main(String[] args) {
        Animal animaldefault = new Animal();
        Animal animalOneParameter = new Animal(22);
        Animal animalTwoParameter = new Animal( 21,99);

        System.out.println(animaldefault.getAge() + " == " + animaldefault.getHeight());
        System.out.println(animalOneParameter.getAge() + " == " + animalOneParameter.getHeight());
        System.out.println(animalTwoParameter.getAge() + " == " + animalTwoParameter.getHeight());
    }
}
