package com.Elkood.A;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Grade_Allocation_A1316 {
    static int t;
    static int n, m;
    static int[] a;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new Scanner(System.in), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(Scanner input, PrintWriter pw) {
        t = input.nextInt();
        while (t-- > 0) {
            n = input.nextInt();
            m = input.nextInt();
            a = new int[n];
            IntStream.range(0, n).forEach(i -> {
                a[i] = input.nextInt();
            });
            int sum = Arrays.stream(a, 0, n).sum();
            pw.println(Math.min(sum, m));


        }

    }

}



