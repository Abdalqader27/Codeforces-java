package com.Elkood.C;

import com.Elkood.Main;
import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Yet_Another_Walking_Robot_1296C {
    static int t;
    static int n;
    static String s;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        Input(new FastReader(), pw);
        pw.flush();
        pw.close();
    }

    public static void Input(FastReader input, PrintWriter pw) {
        t = input.nextInt();
        while (t-- > 0) {
            n = input.nextInt();
            s = input.nextLine();
            int x = 0, y = 0, min = Integer.MAX_VALUE;
            int temp1 = -1, temp2 = -1;
            Map<Pair<Integer,Integer>, Integer> map = new HashMap<>();
            map.put(new Pair<>(0,0), 0);
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L')
                    x--;
                if (s.charAt(i) == 'R')
                    x++;
                if (s.charAt(i) == 'U')
                    y++;
                if (s.charAt(i) == 'D')
                    y--;
                Pair<Integer,Integer>p=new Pair<>(x,y);
                if (map.containsKey(p)) {
                    int l = map.get(p) + 1;
                    int r = i + 1;
                    int len = r - l + 1;
                    if (len < min) {
                        temp1 = l;
                        temp2 = r;
                        min = len;
                    }
                }
                map.put(p, (i + 1));
            }
            if (temp1 != -1 && temp2!=-1)
                pw.println(temp1 + " " + temp2);
            else
                pw.println(-1);
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


