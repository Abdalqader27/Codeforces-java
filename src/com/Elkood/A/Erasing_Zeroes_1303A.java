package com.Elkood.A;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Erasing_Zeroes_1303A {
    static String x;
    static int t;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new Scanner(System.in), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(Scanner input, PrintWriter pw) {
        t = input.nextInt();
        while (t-- > 0) {
            x = input.next();
            int count=0;
            int left = 0;
            int right = x.length() - 1;
            while (x.charAt(left++) != '1' && left <= x.length() - 1) ;
            while (x.charAt(right--) != '1' && right >= left) ;
            count = (int) IntStream.rangeClosed(left, right).filter(i -> x.charAt(i) == '0').count();

            pw.println(count);
        }
    }
}


