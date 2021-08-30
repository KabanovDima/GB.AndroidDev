package Lesson7_HW;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public int getFood() {
        return food;
    }

    public void info(int appetite) {
        if (food >= appetite) {
            System.out.println("plate: " + food);
        }/*else {
            System.out.println("plate: еды не хватает");
        }*/
    }

    public void addFood(int appetite) {
        if (food < appetite) {
            System.out.println("Чтобы кот был сыт, нужно добавить " + (appetite - food) + " еды.");
            food += (appetite - food);
        }
    }





}
