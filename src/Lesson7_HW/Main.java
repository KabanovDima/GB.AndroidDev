package Lesson7_HW;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Barsik", 170), new Cat("Stepan", 40)};
        Plate plate = new Plate(100);

        plate.info(plate.getFood());
            for (int i = 0; i < cat.length; i++) {
                    cat[i].eat(plate);

                //cat[i].isFullness();
               // System.out.println("Кот сыт - " + cat[i].isFullness());
                plate.info(plate.getFood() - cat[i].getAppetite());
            }
    }
}
