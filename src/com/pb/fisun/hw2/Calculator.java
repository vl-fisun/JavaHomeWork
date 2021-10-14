package com.pb.fisun.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int operand1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int operand2 = scan.nextInt();
        System.out.print("Введите символ: ");
        String sign = scan.next();

        switch (sign) {
            case "+" :
                System.out.println (operand1 + operand2);
            break;
            case "-" :
                System.out.println (operand1 - operand2);
                break;
            case "*" :
                System.out.println (operand1 * operand2);
                break;
            case "/" :
            {
                if (operand2 == 0)
                    System.out.println("На ноль делить нельзя");
                else
                    System.out.println(operand1 / operand2);
                break;
            }
            default:
                System.out.println ("Введите символ +,-,*,/");
        }
    }
}
