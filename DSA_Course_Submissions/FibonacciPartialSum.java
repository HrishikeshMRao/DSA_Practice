import java.util.Scanner;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        if (to <= 1)
        return to;

        if(from==to) from =to-1;
        
    int previous = 0;
    int digit = 1;
    int temp;
    int digit_from=1;

    for (int i = 1; i < to+2; i++) {
        temp = digit;
        digit = (previous + digit);
        previous = temp;
        if(digit>=10){digit%=10;}
        if(i==(from+1)){digit_from=(digit-1);}
    }
    return ((digit_from-(digit-1)));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

