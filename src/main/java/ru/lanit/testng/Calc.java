package ru.lanit.testng;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstNum =  in.next();
        String oper =  in.next();
        String secondNum =  in.next();
        Counter a = new Counter();
        System.out.println(a.start(firstNum, oper, secondNum));
    }
}
