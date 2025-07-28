public class SortParity {
    public static void sortBinaryArray(int[] arr) {
        int n = arr.length;
        int left =0 , right = n-1;

        while (left<right){
            if(arr[left]%2== 0){
                left++;
            }
            else if (arr[right]%2 ==1) {
                right--;

            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,6,8,10};
        sortBinaryArray(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



