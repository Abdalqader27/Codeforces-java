package com.Elkood.C;

import java.io.PrintWriter;
import java.util.Scanner;

public class Given_Length_and_Sum_of_Digits_489C {
    static int m, s;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new Scanner(System.in), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(Scanner input, PrintWriter pw) {
        m = input.nextInt();
        s = input.nextInt();
        if (m == 1 && s > 9 || s == 0 && m > 1) {pw.println((-1) + " " + (-1));
            pw.flush();
            pw.close();
            System.exit(0);}

        else if (m == 1) {
            pw.println((s) + " " + (s));
            pw.flush();
            pw.close();
            System.exit(0);
        }
        StringBuilder MAX = new StringBuilder();
        int SUB = s;
        for (int i = 0; i < m; ++i)
        {
            if (SUB >= 9) { SUB -= 9; MAX.append("9"); }
            else {MAX.append(SUB); SUB-=SUB; }
        }
        if(SUB>0){pw.println((-1) + " " + (-1));
            pw.flush();
            pw.close();
            System.exit(0);}
        StringBuilder Min=new StringBuilder(MAX);
        Min.reverse();

        if(Min.charAt(0)=='0'){
            Min.setCharAt(0, '1');
            for(int i=1;i<m;++i){
                if(Min.charAt(i)!='0')
                {
                    Min.setCharAt(i,(char)(Min.charAt(i)-1));
                    break;
                }
            }}
        pw.println(Min +" "+MAX);


    }

}

