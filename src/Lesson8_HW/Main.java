package Lesson8_HW;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {new Human(), new Cat(), new Robot()};
        Bariers[] bariers = {new RunTrack(), new Wall()};
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < bariers.length; j++) {
                bariers[j].start(participants[i]);
            }
            System.out.println();
        }



    }
}
