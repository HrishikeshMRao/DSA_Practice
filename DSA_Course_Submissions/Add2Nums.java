import java.util.Scanner;

class Add2Nums
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c;
            c = a + b;
            System.out.println(c);
        }
        
    }
}