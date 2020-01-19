package com.Elkood.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


    public class Find_Square_1028A {

        static int n, m;
        static String[] x;


        public static void main(String[] args) {
            PrintWriter pw = new PrintWriter(System.out);
            Input(new FastReader(), pw);
            Solve(pw);
            pw.flush();
            pw.close();
        }

        public static void Solve(PrintWriter pw) {


        }


        public static void Input(FastReader input, PrintWriter pw) {
            n = input.nextInt();
            m = input.nextInt();
            x = new String[n];
            IntStream.range(0, n).forEach(i -> x[i] = input.nextLine());
            int saveI = -1, saveJ = -1;
            int i = 0;
            int numB = 0;
            while (i < n) {
                int j = 0;
                while (j < m) {
                    if (x[i].charAt(j) == 'B') {
                        numB++;
                    }
                    ++j;
                }
                i++;
            }
            i = 0;
            numB = (int) Math.ceil(numB / 2f);
            while (i < n) {
                int j = 0;
                while (j < m) {
                    if (x[i].charAt(j) == 'B' && numB > 0) {
                        numB--;
                        saveI = i + 1;
                        saveJ = j+ 1;
                    }
                    ++j;
                }
                i++;
            }

            pw.println(saveI + " " + saveJ);
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
