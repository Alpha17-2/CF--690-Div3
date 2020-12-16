/*  Author : Alpha_The_Coder
    Created On 15/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C {
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
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        try {

            int t=sc.nextInt();
            while (t-->0) {

                int n = sc.nextInt();
                if (n < 10) System.out.println(n);
                else if (n>45)
                    System.out.println("-1");
                else
                {
                   String ans="";
                   int m=9;
                   while (n>0)
                   {
                       if (n-m>=0)
                       {
                           n-=m;
                           ans+=String.valueOf(m);
                       }
                       m--;
                   }
                    System.out.println(sortString(ans));
                }

            }

        } catch (Exception e) {
            System.out.println("Run Away error or Alpha will hunt you down !!");
        }
    }
}
// This code is solely contributed by Subhojeet Sahoo aka Alpha_The_Coder