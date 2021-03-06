package com.Elkood.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


    public class Circle_of_Students_A1203 {

        static int n, m;
        static int[] a;


        public static void main(String[] args) {
            PrintWriter pw = new PrintWriter(System.out);
            Input(new FastReader(), pw);
            //  Solve(pw);
            pw.flush();
            pw.close();
        }

        public static void Input(FastReader input, PrintWriter pw) {
            n = input.nextInt();
            for (int i = 1; i <= n; ++i) {
                m = input.nextInt();
                a = new int[m];
                for (int j = 0; j < m; j++)
                    a[j] = input.nextInt();

                if (isCircularSorted(a)) pw.println("YES");
                else pw.println("NO");
            }

        }

        public static boolean isCircularSorted(int[] array) {
            int size = array.length;
            int count = 0;
            boolean one_n_1 = false;
            for (int x = 1; x < size; x++)
                if (Math.abs(array[x - 1] - array[x]) == 1) {
                } else {
                    if (!one_n_1 && Math.abs(array[x - 1] - array[x]) == size - 1) {
                        one_n_1 = true;
                    } else {
                        return false;
                    }
                }
            return true;
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
