package Lesson6_HW;

public class Dog extends Animals{
    @Override
    public void run(double dist) {
        if(dist > 500) {
            System.out.println("Dog не может пробежать " + dist + ", максимум 500");
        } else {
            System.out.println("Dog пробежал " + dist);
        }
    }

    @Override
    public void swim(double dist) {
        if(dist >10) {
            System.out.println("Dog не может проплаыть " + dist + ", максимум 10");
        } else {
            System.out.println("Dog проплыл: " + dist);
        }
    }

}
