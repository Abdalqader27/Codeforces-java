package com.Elkood.A;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tom_Riddles_Diary_855A {
    static int t;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new Scanner(System.in), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(Scanner input, PrintWriter pw) {
        t = input.nextInt();
        Map<String, String> map = new HashMap<>();
        while (t-- > 0) {
            String x = input.next();
            if (!map.containsKey(x))
            {
                pw.println("NO"); map.put(x, x);

            } else pw.println("YES");

        }

    }
}

