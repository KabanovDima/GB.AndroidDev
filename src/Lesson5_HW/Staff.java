package Lesson5_HW;

public class Staff {

    private String Name;
    private String Title;
    private String email;
    private int Tel;
    private double Sal;
    private int Age;

    public Staff(String Name, String Title, String email, int Tel, double Sal, int Age) {
        this.Name = Name;
        this.Title = Title;
        this.email = email;
        this.Tel = Tel;
        this.Sal = Sal;
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void printStaff() {
        System.out.printf("ФИО: %s%n Должность: %s%n email: %s%n телефон: %s%n зарплата: %s%n возраст: %s%n", Name, Title, email, Tel, Sal, Age);
    }

}
