package animal_task;

public class Fish extends Animal{
    public Fish(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating worms");
    }
}
