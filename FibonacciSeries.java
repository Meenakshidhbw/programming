public class FibonacciSeries {

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 3; 
        
        System.out.print("The Fibonacci series up to " + n + " is: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
