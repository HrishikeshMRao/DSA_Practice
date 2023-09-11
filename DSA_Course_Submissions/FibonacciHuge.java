import java.util.Scanner;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        
        long Mclone = m,digitKiller=10;
        long previous = 0;
        long digit = 1;

        if (n <= 1)
            return n;

        while(Mclone>0)
        {
            Mclone = Mclone/10;
            digitKiller *=10;
        }
        

        for (int i = 1; i < n; i++) {
            long temp = digit;
            digit = (previous + digit);
            previous = temp;
            if(digit>=digitKiller){digit=digit%digitKiller;}
            if(previous>=digitKiller){previous=previous%digitKiller;}
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

