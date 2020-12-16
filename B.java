/*  Author : Alpha_The_Coder
    Created On 15/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B {
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
            while (t-->0) {
                int n = sc.nextInt();
                String s = sc.next();
                if(s.startsWith("2020")||s.endsWith("2020"))
                    System.out.println("YES");
                else
                {
                    if(s.startsWith("202") && s.endsWith("0"))
                        System.out.println("YES");
                    else if(s.startsWith("20")&& s.endsWith("20"))
                        System.out.println("YES");
                    else if (s.startsWith("2")&& s.endsWith("020"))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        } catch (Exception e) {
            System.out.println("Run Away error or Alpha will hunt you down !!");
        }
    }
}
// This code is solely contributed by Subhojeet Sahoo aka Alpha_The_Coder