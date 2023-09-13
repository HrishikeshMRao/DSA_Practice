import java.util.Scanner;

public class FibonacciHuge {
    private static long long getFibonacciHugeNaive(long n, long m) {
        
        long long previous = 0;
        long long digit = 1;

        if (n <= 1)
            return n;

        for (int i = 1; i < n; i++) {
            long temp = digit;
            digit = (previous + digit);
            previous = temp;
            
        }
        return digit;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

