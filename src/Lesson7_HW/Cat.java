package Lesson7_HW;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }
    /*public boolean isFullness() {
        return fullness;
    }*/
    public void eat(Plate p) {
            if (appetite <= p.getFood()) {
                p.decreaseFood(appetite);
                System.out.printf("%s appetite: %s%n", name, appetite);
                fullness = true;
                System.out.println("Кот сыт - " + fullness);
            } else {
                System.out.printf("%s appetite: %s%n", name, appetite);
                System.out.println("Кот сыт - " + fullness);
                p.addFood(appetite);
            }
    }

}
