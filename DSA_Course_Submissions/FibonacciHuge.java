import java.util.Scanner;

public class FibonacciHuge {

    private static long pisano(long m)
    {
        long prev = 0;
        long curr = 1;
        long res = 0;
        for(int i = 0; i < m * m; i++)
        {
            long temp = curr;
            curr = (prev + curr) % m;
            prev = temp;
            if (prev == 0 && curr == 1)
                res= i + 1;
        }
        return res;
    }

    private static long getFibonacciHugeNaive(long n, long m) {
        
        long pisanoPeriod = pisano(m);
        n = n % pisanoPeriod;
        long previous = 0;
        long digit = 1;

        if (n <= 1)
            return n;

        for (int i = 2; i <= n; i++) {
            long temp = digit;
            digit = (previous + digit)%m;
            previous = temp;
            
        }
        return digit%m;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

