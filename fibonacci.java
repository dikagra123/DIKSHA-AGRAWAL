public class fibonacci {
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int prev = fibonacci(n - 1);
        int prevprev = fibonacci(n - 2);
        return prev + prevprev;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}