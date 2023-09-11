import java.util.Scanner;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        if (to <= 1)
        return to;

    int previous = 0;
    int digit = 1;
    int sum =1;

    for (int i = 1; i < to; i++) {
        int temp = digit;
        digit = (previous + digit);
        previous = temp;
        if(digit>=10){digit=digit%10;}
        if(previous>=10){previous=previous%10;}
        if(i>=from-1)
        sum += digit;
        if(sum>=10){sum%=10;}
    }
    
    return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

