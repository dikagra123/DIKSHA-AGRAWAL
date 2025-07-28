import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int sum = 0;

        // Step 2: Take every 2nd element starting from index 0
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int result = arrayPairSum(nums);
        System.out.println("Maximized sum: " + result); // Output: 4
    }
}
