package spring_introduction;

public class Dog implements Pet{

    @Override
    public void sayPet() {
        System.out.println("Woof");
    }
}
