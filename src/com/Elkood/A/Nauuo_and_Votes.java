package com.Elkood.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Nauuo_and_Votes {

    static int x, y, z;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new FastReader(), pw);
        pw.flush();
        pw.close();
    }


    public static void Input(FastReader input, PrintWriter pw) {
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        pw.println((x > z && x > y && x - y > z) ? "+" : (y > x && y > z && y - x > z) ? "-" : (x == y & x - y == z) ? "0" : "?");
    }

    public static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String string = "";
            try {
                string = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return string;
        }

        char nextChar() {
            return next().charAt(0);
        }

        String[] nextStringArray() {
            String[] str = null;
            try {
                str = this.br.readLine().trim().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextIntArray() {
            String[] data = nextStringArray();
            int[] a = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data = nextStringArray();
            Integer[] a = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data = nextStringArray();
            long[] a = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }

        public boolean hasNext() throws IOException {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String s = br.readLine();
            if (s == null || s.isEmpty()) {
                return false;
            }
            st = new StringTokenizer(s);
            return true;
        }

    }


}
