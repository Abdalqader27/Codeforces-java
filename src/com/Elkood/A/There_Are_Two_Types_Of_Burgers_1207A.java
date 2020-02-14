package com.Elkood.A;

import java.io.PrintWriter;
import java.util.Scanner;

public class There_Are_Two_Types_Of_Burgers_1207A {
    static int t;
    static int b, p, f;
    static int h, c;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new Scanner(System.in), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(Scanner input, PrintWriter pw) {
        t = input.nextInt();
        while (t-- > 0) {
            b = input.nextInt() / 2;
            p = input.nextInt();
            f = input.nextInt();//
            h = input.nextInt();
            c = input.nextInt();

            int u1 = 0;
            int u2 = 0;
            int max = Math.max(h, c);
            if (max == h) {  u1 =  Math.min(b, p) * h; b -= Math.min(b, p);
                if(b>=0) u2 = Math.min(b, f) * c; }
            else { u1 = c * Math.min(b, f); b -= Math.min(b, f);
                if(b>=0) u2 = Math.min(b, p) * h; }
            pw.println(u1+u2);

        }
    }
}


