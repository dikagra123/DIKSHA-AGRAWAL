public class MiscProblems {
     static void  SwapWithoutTemp(int a, int b) {

        System.out.println("original values before swap");
        System.out.println("a: " + a);
        System.out.println("b:" + b);


        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("original values after swap");
        System.out.println(a + "");
        System.out.println(b + "");
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        int[] arr = {23, 45, 67, 34, 66};

        SwapWithoutTemp(a,b);

    }
}
