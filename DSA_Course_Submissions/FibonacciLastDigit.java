import java.util.Scanner;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int digit = 1;

        for (int i = 1; i < n; i++) {
            int temp = digit;
            digit = (previous + digit);
            previous = temp;
            if(digit>=10){digit=digit%10;}
            if(previous>=10){previous=previous%10;}
        }
        
        return digit;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

