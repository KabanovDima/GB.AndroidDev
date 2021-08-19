package Lesson5_HW;

public class Main {

    public static void main(String[] args) {

        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Иванов Иван Иванович", "Директор", "iii@ie.com", 8343111, 100000.50, 50);
        staffArray[1] = new Staff("Добрынин Максим", "Учитель", "dm@gb.com", 8343112, 300000.60, 31);
        staffArray[2] = new Staff("Dima", "Student", "dk@gb.com", 8343114, 0.50, 32);
        staffArray[3] = new Staff("Петухов Евгений Геннадьевич", "Уборщик", "", 8343116, 30.70, 54);
        staffArray[4] = new Staff("Сорокина Мария Викторовна", "Ассистент", "sev@ie.com", 8343110, 7000.50, 25);

        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i].getAge() > 40) {
                staffArray[i].printStaff();
            }
        }


    }
}
