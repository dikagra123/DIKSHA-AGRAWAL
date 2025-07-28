
        public class SortZeroesAndOnes{
            public static void sortBinaryArray(int[] arr) {
                int n = arr.length;
            int left =0 , right = n-1;

            while (left<right){
                if(arr[left] == 0){
                    left++;
                }
                else if (arr[right] == 1) {
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
                int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
                sortBinaryArray(arr);

                // Print the sorted array
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }
        }



