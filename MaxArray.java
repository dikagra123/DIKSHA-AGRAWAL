public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {23,45,67,4,200,100,89,69,24};

         int max = Integer.MIN_VALUE;

         for(int i = 0;i<arr.length;i++){

             if (arr[i]>max) max = arr[i];
         }
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++) {

            if (arr[i] > smax && arr[i] != max)
                smax = arr[i];
        }
         System.out.println(max);
        System.out.println(smax);
    }
}
