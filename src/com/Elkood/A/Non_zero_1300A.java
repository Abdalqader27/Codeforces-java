package com.Elkood.A;

import com.Elkood.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Non_zero_1300A {
    static int t;
    static int n;
    static int a[];

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new Main.FastReader(), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(Main.FastReader input, PrintWriter pw) {
        t = input.nextInt();
        int zero = 0;
        int sum = 0;
        int ans = 0;
        while (t-- > 0) {

            n = input.nextInt();
            a = input.nextIntArray();

            ans = 0; zero = 0; sum = 0;
            int i = 0;
            while (i < n) {  if (a[i] == 0) zero++; sum += a[i]; i++; }
            if (zero > 0 ) { sum += zero; ans = zero; }
            while (sum == 0) { sum++;ans++; }
            pw.println(ans);

        }

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

        public String[] nextStringArray() {
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



