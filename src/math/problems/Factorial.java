package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int a=5;
        int b=1;

        for (int c=1; c<=a; c++) {
            b *=c;
        }
        System.out.println("Factorial of 5 Using Iteration : " + b);
        System.out.println("Factorial of 5 using Recursion : " + factorial (5));
    }

    public static int factorial ( int a){
        if (a==0){
            return 1;
        } else {
            return a*factorial(a - 1);

        }

    }

}