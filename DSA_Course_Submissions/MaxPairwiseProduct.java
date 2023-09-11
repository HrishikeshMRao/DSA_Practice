import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Hrishikesh M Rao
public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        long max_product;
        int n = numbers.length;
        long Largest =0, SecondLargest=0;
        for (int first = 0; first < n; first++) 
        {
             if(numbers[first]>Largest) 
             {SecondLargest=Largest;Largest=numbers[first];}
             else if (numbers[first]>SecondLargest) 
             {SecondLargest = numbers[first];}
        }
        max_product = Largest * SecondLargest;
        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
    }

}
