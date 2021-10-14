package com.pb.fisun.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 14, c = 15, d = 35, e = 36, f = 50, g = 51, h = 100;
        System.out.print("Введите число: ");
        int operand = scan.nextInt();

            if (operand >= a && operand <= b) {
                System.out.println("Ваше число " + operand + " попадает в промежуток от " + a + " до " + b);
            } else if (operand >= c && operand <= d) {
                System.out.println("Ваше число " + operand + " попадает в промежуток от " + c + " до " + d);
            } else if (operand >= e && operand <= f) {
                System.out.println("Ваше число " + operand + " попадает в промежуток от " + e + " до " + f);
            } else if (operand >= g && operand <= h) {
                System.out.println("Ваше число " + operand + " попадает в промежуток от " + g + " до " + h);
            } else if (operand >= h) {
                System.out.println("Ваше число " + operand + " не попадает ни в один из заданных промежутков");
            }
    }
}
