package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {
        start();
    }

    static void start() {
        char[][] field = createField();
        //drawField(field);

      do {
          doPlayerMove(field);
          //drawField(field);
          if (isWin(field, 'X')) {
              System.out.println("Поздравляем, вы победили!");
              break;
          }
          if (isDraw(field)) {
          }
          doAiMove(field);
          drawField(field);
          if (isWin(field, '0')) {
              System.out.println("Жаль, вы проиграли!");
              break;
          }
          if (isDraw(field)) {
              System.out.println("Ничья");
              break;
          }
      }while(true);
    }

    static boolean isDraw(char[][] field) {
        for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWin(char[][] field, char simbol) {

        //horizontal
        boolean horizont;
        for (int i = 0; i < field.length; i++) {
            horizont = true;
            for (int j = 0; j < field.length; j++) {
                horizont = horizont && field[i][j] == simbol;
            }
            if(horizont) {
                return true;
            }
        }
        //Другие варианты проверки горизонталей
        /*for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {

                if(field[i][j] == simbol && field[i][1] == simbol && field[i][2] == simbol)  {
                    return true;
                }
            }
        }*/
       /*if (field[0][0] == simbol && field[0][1] == simbol && field[0][2] == simbol) {
            return true;
        }
        if (field[1][0] == simbol && field[1][1] == simbol && field[1][2] == simbol) {
            return true;
        }
        if (field[2][0] == simbol && field[2][1] == simbol && field[2][2] == simbol) {
            return true;
        }*/
        //vertical
        boolean vertical;
        for (int i = 0; i < field.length; i++) {
            vertical = true;
            for (int j = 0; j < field.length; j++) {
                vertical = vertical && field[j][i] == simbol;
            }
            if(vertical) {
                return true;
            }
        }
        //Другие варианты проверки вертикалей
        /*for(int j = 0; j < field.length; j++) {
            for (int i = 0; i < field.length; i++) {

                if(field[i][j] == simbol && field[1][j] == simbol && field[2][j] == simbol)  {
                    return true;
                }
            }
        }*/
        /*if (field[0][0] == simbol && field[1][0] == simbol && field[2][0] == simbol) {
            return true;
        }
        if (field[0][1] == simbol && field[1][1] == simbol && field[2][1] == simbol) {
            return true;
        }
        if (field[0][2] == simbol && field[1][2] == simbol && field[2][2] == simbol) {
            return true;
        }*/
        //diagonal
        boolean diag = true;
        for (int i = 0; i < field.length; i++) {
            diag = diag && field[i][field.length-i-1] == simbol || diag && field[i][i]  == simbol;
        } if(diag) {
            return true;
        }
        // другие варинаты проверки диагоналей
        /*for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {

                if(field[i][j] == simbol && field[1][1] == simbol && field[2][2] == simbol ||
                        field[i][2] == simbol && field[1][1] == simbol && field[2][j] == simbol)  {
                    return true;
                }
            }
        }*/
        /*if (field[0][0] == simbol && field[1][1] == simbol && field[2][2] == simbol) {
            return true;
        }
        if (field[0][2] == simbol && field[1][1] == simbol && field[2][0] == simbol) {
            return true;
        }*/
        return false;
    }

    static char[][] createField() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер поля одной цифрой (пример: 3=3х3; 5=5х5): ");
        int x = scanner.nextInt();
        char[][] field = new char[x][x];
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++)
            field[i][j] = '-';
        }
        return field;
        //Создание поля 3х3
        /*return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };*/

    }

    static void doPlayerMove(char[][] field) {
        int h, v;
        do {
            h = getCoordinate(field.length - 1, 'h');
            v = getCoordinate(field.length - 1, 'v');
        }while (isNotFreeCell(field, h, v));

        field[h][v] = 'X';
    }

    static void doAiMove(char[][] field) {
        Random random = new Random();
        int h, v;
        do {
            h = random.nextInt(field.length);
            v = random.nextInt(field.length);
        }while(isNotFreeCell(field, h, v));
        field[h][v] = '0';
    }

    static boolean isFreeCell(char[][] field, int h, int v) {
        return field[h][v] == '-';
    }

    // False -> !False -> True
    static boolean isNotFreeCell(char[][] field, int h, int v){
        return !isFreeCell(field, h, v);
    }

    static int getCoordinate(int lastIndex, char coordName) {
        Scanner scanner = new Scanner(System.in);
        int coord;
        do {
            System.out.printf("Подалуйста введите %s - коордмнату от 1 до %s%n", coordName, lastIndex+1);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord > lastIndex);
        return coord;
    }

    static void drawField(char[][] field) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

    }



}
