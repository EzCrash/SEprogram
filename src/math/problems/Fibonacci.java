package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 40, a = 0, b = 1;
        System.out.println("Here are " + n + " series of Fibonacci numbers: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + ", ");

            int sum = a + b;
            a = b;
            b = sum;

        }

    }
}
