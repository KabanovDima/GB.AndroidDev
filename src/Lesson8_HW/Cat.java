package Lesson8_HW;

public class Cat implements Participants{

    @Override
    public void run() {
        System.out.println("Cat is running...");

    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping...");
    }
}
