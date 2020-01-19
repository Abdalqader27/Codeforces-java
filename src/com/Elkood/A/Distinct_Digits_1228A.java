package com.Elkood.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.IntStream;


public class Distinct_Digits_1228A {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new FastReader(), pw);
        pw.flush();
        pw.close();
    }


    public static void Input(FastReader input, PrintWriter pw) {
        int m, n = 0;
        n = input.nextInt();
        m = input.nextInt();
        int i = n;
        while (i <= m) {
            String b = String.valueOf(i);
            Map<Character, Integer> map = new HashMap<>();

            IntStream.range(0, b.length()).forEach(j -> {
                if (!map.containsKey(b.charAt(j))) {
                    map.put(b.charAt(j), 1);
                } else {
                    int o = map.get(b.charAt(j)) + 1;
                    map.put(b.charAt(j), o);
                }
            });
            boolean v = map.entrySet().stream().noneMatch(l -> l.getValue() > 1);
            if (v) {
                pw.println(b);
                pw.flush();
                pw.close();
                System.exit(0);
            }
            i++;
        }
        pw.println(-1);

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
