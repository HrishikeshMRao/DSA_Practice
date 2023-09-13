import java.util.Scanner;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int digit = 1;
        int temp;

        for (long i = 1; i < n+2; i++) {
            temp = digit;
            digit = (previous + digit);
            previous = temp;
            if(digit>=10){digit%=10;}
        }
        return digit-1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }
}

