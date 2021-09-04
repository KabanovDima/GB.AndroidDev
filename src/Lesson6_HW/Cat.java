package Lesson6_HW;

public class Cat extends Animals{
    @Override
    public void run(double dist) {
        if(dist > 200) {
            System.out.println("Cat не может пробежать " + dist + ", максимум 200");
        } else {
            System.out.println("Cat пробежал " + dist);
        }
    }

    @Override
    public void swim(double dist) {
        System.out.println("Cat не умеет плавать");
    }
}
