import java.util.*;
public class SubarrayWithGivenSum {
    public static List<Integer>findSubarray(int[] arr,int target) {
        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++){
            sum += arr[end];

        while (sum > target && start <= end) {
            sum -= arr[start];
            start++;

        }
        if (sum == target) {
            return Arrays.asList(start + 1, end + 1);
        }
    }
    return Arrays.asList(-1);
}
public static void main(String[] args) {
    int[] arr = {1,2,3, 4};
    int target = 3;
    List<Integer> result = findSubarray(arr, target);
    System.out.println(result);
}
}