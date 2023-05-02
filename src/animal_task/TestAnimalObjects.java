package animal_task;

public class TestAnimalObjects {
    public static void main(String[] args) {
        Cat cat = new Cat("Lucy", "Bengali", 'F');
        System.out.println(cat);
        cat.eat();

        Dog dog = new Dog("Rex", "German Shepard", 'M');
        System.out.println(dog);
        dog.eat();

        Fish fish=new Fish("Herman", "Salmon", 'M');
        System.out.println(fish);
        fish.eat();
        
        //updating in TestAnimalObject from gitHub
    }
}
