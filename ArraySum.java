public class ArraySum {
    public static void main(String[] args) {
        // code here
        int[] arr = {1,2,3,4};
        int sum = 0;

        for(int num:arr) {
            sum += num;
        }
        System.out.println("sum of array" + sum);
    }
}
