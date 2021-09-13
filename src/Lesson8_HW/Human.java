package Lesson8_HW;

public class Human implements Participants{
   @Override
    public void run() {
       System.out.println("Human is running");
   }
    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }
}
