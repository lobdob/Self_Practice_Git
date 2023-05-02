package animal_task;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }
}
