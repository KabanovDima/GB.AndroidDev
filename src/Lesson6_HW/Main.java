package Lesson6_HW;

public class Main {
    public static void main(String[] args) {
        moveAnimals(createAnimals());
    }

    static void moveAnimals(Animals[] animal) {
        for (int i = 0; i < animal.length; i++) {
            animal[i].run(150.5); animal[i].swim(15);
            
        }
    }

    static Animals[] createAnimals() {
        return new Animals[] {
                new Cat(), new Dog()
        };
    }

}

