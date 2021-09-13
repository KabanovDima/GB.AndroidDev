package Lesson8_HW;

public class RunTrack implements Bariers{

    @Override
    public void start(Participants participants){
        participants.run();
        System.out.println("Участник проходит беговую дорожку");
    }

}


