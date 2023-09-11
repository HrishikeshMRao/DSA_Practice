import java.util.Scanner;

public class Fibonacci {

  private static long calc_fib(int n) {
    long first =1;
    long second =1;
    long third=1;
    if(n==0) third =0;
    for(int i=2;i<n;i++)
    {
      third = first + second;
      first = second;
      second = third;
    }
    return third;
  }

  public static void main(String args[]) {
    try(Scanner in = new Scanner(System.in)){
    int n = in.nextInt();

    System.out.println(calc_fib(n));
    }
  }
}
