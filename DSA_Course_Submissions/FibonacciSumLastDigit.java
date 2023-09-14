import java.util.Scanner;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;
        long len=1;
        long digit=(long)((Math.pow(1.618034,n+2)-Math.pow((1-1.618034), n+2))/Math.sqrt(5));
        long dup = digit;
        while(dup>0) {dup/=10; len*=10;}
        return (long)((digit-1)%Math.pow(10, len));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }
}

