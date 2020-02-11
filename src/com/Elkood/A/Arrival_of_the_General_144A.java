package com.Elkood.A;

import com.Elkood.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Arrival_of_the_General_144A {
    static int n;
    static int[] a;


    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new FastReader(), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(FastReader input, PrintWriter pw) {
        n = input.nextInt();
        a = new int[n];
        a = input.nextIntArray();
        pw.println(findIndexMax(a) + (n - 1 - findIndexMin(a)) - (findIndexMin(a) < findIndexMax(a) ? 1 : 0));
    }

    static void Swap(int dex1, int dex2) {
        int temp = a[dex1];
        a[dex1] = a[dex2];
        a[dex2] = temp;
    }

    static int findIndexMin(int[] a) {
        int value = Integer.MAX_VALUE;
        int index = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] <= value) {
                value = a[i];
                index = i;
            }
            ++i;
        }
        return index;
    }

    static int findIndexMax(int[] a) {
        int value = Integer.MIN_VALUE;
        int index = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] > value) {
                value = a[i];
                index = i;
            }
            ++i;
        }
        return index;
    }


    public static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
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

        public int[] nextIntArray() {
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



