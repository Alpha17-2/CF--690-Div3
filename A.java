/*  Author : Alpha_The_Coder
    Created On 15/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        try {
            int t=sc.nextInt();
            while(t-->0)
            {

                int n=sc.nextInt();
                int[] ans=new int[n];
                int[] a=new int[n];
                for (int i = 0; i <n ; i++) {
                    a[i]=sc.nextInt();
                }
                if(n%2==0)
                {
                    for (int i = 0; i <n/2 ; i++) {
                        System.out.print(a[i]+" ");
                        System.out.print(a[n-i-1]+" ");
                    }
                }
                else
                {
                        for (int i = 0; i <n/2 ; i++) {
                            System.out.print(a[i]+" ");
                            System.out.print(a[n-i-1]+" ");
                        }

                    System.out.print(a[n/2]);
                }
                System.out.println();
            }



        } catch (Exception e) {
            System.out.println("Run Away error or Alpha will hunt you down !!");
        }
    }
}
// This code is solely contributed by Subhojeet Sahoo aka Alpha_The_Coder