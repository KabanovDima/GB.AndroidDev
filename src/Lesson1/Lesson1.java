package Lesson1;

public class Lesson1 {

    public static void main(String[] args) {
    	/*
    	№2 Создаем переменные всех пройденных типов данных и инициализируем их значения.
    	*/

        byte var1 = 50;
        short var2 = -3240;
        int var3 = 6798787;
        long var4 = 87890899898098L;
        float var5 = 14.54f;
        double var6 = 14.54;
        char var7 = 'd';
        boolean var8 = true;

        // Вывод в консоль название типов данных и их значения
        System.out.println("byte: " + var1 +", " + "short: " + var2 + ", " + "int: " + var3 + ", " + "long: " + var4);
        System.out.println("float: " + var5 +", " + "double: " + var6);
        System.out.println("char: " + var7);
        System.out.println("boolean: " + var8);

        // вывод в консоль ответа на задачу №3
        float result = calculat(1.5f, 2.5f, 3.5f, 4.5f);
        System.out.println("Задача №3: " + result);

        // вывод в консоль ответа на задачу №4
        boolean result4 = between10_20(15, 15);
        System.out.println("Задача №4: " + result4);

        // вывод в консоль ответа на задачу №5
        isPosOrNeg(-1.5);

        // вывод в консоль ответа на задачу №6
        boolean result6 = isNegOrPos(-6);
        System.out.println("Задача №6: " + result6);

        // Вывод в консоль ответа на задачу №7
        name("Dima");

        // Вывод в консоль ответа на задачу №8, про високосный год
        year(2024);



    }

    // Решения задач из HW

	/*
	№3 	Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
		где a, b, c, d – аргументы этого метода, имеющие тип float.
	 */

    static float calculat(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    /*
    №4 	Написать метод, принимающий на вход два целых числа и проверяющий,
    	что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    	в противном случае – false.
     */
    static boolean between10_20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } return false;
    }

    /*
    №5 Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    static void isPosOrNeg(double a) {
        if (a >= 0) {
            System.out.println("Задача №5: число " + a + " положительное");
        } else {
            System.out.println("Задача №5: число " + a + " отрицательное");
        }
    }

	/*
	№6 Написать метод, которому в качестве параметра передается целое число.
	Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
	 */

    static boolean isNegOrPos(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

	/*
	№7 Написать метод, которому в качестве параметра передается строка,
	обозначающая имя. Метод должен вывести в консоль сообщение
	«Привет, указанное_имя!».
	 */

    static void name(String name) {
        System.out.println("Задача №7: Привет, " + name + "!");
    }

	/*
	№8 *Написать метод, который определяет, является ли год високосным,
	 и выводит сообщение в консоль.
	 Каждый 4-й год является високосным,
	 кроме каждого 100-го,
	 при этом каждый 400-й – високосный.
	 */

    static void year(int a) {
        if (a % 4 != 0) { //Если год делится на 4 с остатком, то год не високосный
            System.out.println("Задача №8: Год " + a + " не високосный");
        } else if (a % 100 != 0) {
            System.out.println("Задача №8: Год " + a + " високосный");
        } else if (a % 400 == 0) {
            System.out.println("Задача №8: Год " + a + " високосный");
        } else {
            System.out.println("Задача №8: Год " + a + " не високосный");
        }
    }
}
