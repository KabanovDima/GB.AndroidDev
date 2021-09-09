package Lesson8_HW;

public class Wall implements Bariers{
    @Override
    public void start(Participants participants) {
        participants.jump();
        System.out.println("Участник перепрыгивает стену");
    }
}
