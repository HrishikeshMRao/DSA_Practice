import java.util.Scanner;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 1)
        return n;

    int previous = 0;
    int digit = 1;
    int sum =1;

    for (int i = 1; i < n; i++) {
        int temp = digit;
        digit = (previous + digit);
        previous = temp;
        if(digit>=10){digit=digit%10;}
        if(previous>=10){previous=previous%10;}
        sum += digit*digit;
        if(sum>=10){sum%=10;}
    }
    
    return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquaresNaive(n);
        System.out.println(s);
    }
}

