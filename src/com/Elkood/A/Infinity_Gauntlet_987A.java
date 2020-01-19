package com.Elkood.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Infinity_Gauntlet_987A {

    static int n;
    static String[] a;
    final static G[] v = {
            new G("purple", "Power"),
            new G("green", "Time"),
            new G("blue", "Space"),
            new G("orange", "Soul"),
            new G("red", "Reality"),
            new G("yellow", "Mind"),
    };

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new FastReader());
        Solve(pw);
        pw.flush();
        pw.close();
    }

    public static void Solve(PrintWriter pw) {
        Map<String, Integer> map = IntStream
                .range(0, n).boxed().collect(Collectors.toMap(i -> a[i], i -> i + 1, (a1, b) -> b));
        pw.println(Math.abs(map.size() - v.length));
        IntStream.range(0, v.length)
                .filter(i -> !map.containsKey(v[i].key)).mapToObj(i -> v[i].value).forEach(pw::println);
    }

    public static void Input(FastReader input) {
        n = input.nextInt();
        a = new String[n];
        IntStream.range(0, n).forEach(i -> a[i] = input.nextLine());

    }

    static class G {
        String key;
        String value;

        public G(String key, String value) {
            this.key = key;
            this.value = value;
        }
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

