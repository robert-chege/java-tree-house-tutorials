package kim.inheritance;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
        Object[] list = {new Dog(), new DogFood()};
//        Dog dog = (Dog) list[0];
//        dog.makeSound();
//        ((Dog) list[0]).makeSound();
        for (Object object : list) {
            if (object instanceof Animal) {
                ((Animal) object).makeSound();
            }
        }
    }
}
