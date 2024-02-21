import java.util.ArrayList;
import java.util.List;

class Animal {
    String name = "Animal";

    String whoAmI() {
        return "me:animal";
    }

    static String staticMethod() {
        return "AnimalStaticM";
    }
}

class Dog extends Animal {
    String name = "Dog";

    @Override
    String whoAmI() {
        return "me:Dog";
    }

    static String staticMethod() {
        return "DogStaticM";
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        List<String> answer = new ArrayList<>();
        answer.add(animal.whoAmI());
        answer.add(Dog.staticMethod());
        System.out.println(answer);
    }
}
