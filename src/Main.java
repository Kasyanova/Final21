/*
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите пример сложения или вычитания с одним неизвестным x без пробелов: ");
        String input = in.nextLine(); //превращаем введённый пример в строку

        //проверка длины строки
        if (input.length()!=5){
            System.out.println("Проверьте, что вы ввели числа от 0 до 9");
        }
        else {

            //знак - или +
            String symbol = input.substring(1,2);

            //вырезать значения чисел и х
            String as = input.substring(0, 1);
            String bs = input.substring(2, 3);
            String cs = input.substring(4, 5);

            //ответ
            int x = 0;

            switch (symbol) {
                case "+":
                    if (as.contains("x")) {
                        int b = Integer.parseInt(bs);
                        int c = Integer.parseInt(cs);
                        x = c - b;
                        System.out.println("x = " + x); //если х первое число
                    } else if (bs.contains("x")) {
                        int a = Integer.parseInt(as);
                        int c = Integer.parseInt(cs);
                        x = c - a;
                        System.out.println("x = " + x); //если х второе число
                    } else {
                        int a = Integer.parseInt(as);
                        int b = Integer.parseInt(bs);
                        x = a + b;
                        System.out.println("x = " + x); //если х третье число
                    }
                    break;
                case "-":
                    if (as.contains("x")) {
                        int b = Integer.parseInt(bs);
                        int c = Integer.parseInt(cs);
                        x = c + b;
                        System.out.println("x = " + x); //если х первое число
                    } else if (bs.contains("x")) {
                        int a = Integer.parseInt(as);
                        int c = Integer.parseInt(cs);
                        x = a - c;
                        System.out.println("x = " + x); //если х второе число
                    } else {
                        int a = Integer.parseInt(as);
                        int b = Integer.parseInt(bs);
                        x = a - b;
                        System.out.println("x = " + x); //если х третье число
                    }
                    break;
                default: System.out.println("Недопустимый знак на второй позиции :( здесь может быть только + или -");
            }
        }
    }
}
