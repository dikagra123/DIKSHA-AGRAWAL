
class Pair{
    int min;
    int max;

    Pair(int min, int max) {
        this.min=min;
        this.max = max;

    }
}
public class MinMax {
    public static Pair getMinMax(int[] arr) {
        if(arr==null || arr.length ==0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int min = arr[0];
        int max = arr[0];

        for(int i =1;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i]> max) {
                max = arr[i];
            }
        }
        return new Pair(min,max);

    }
    public static void main (String[] args) {

        int[] arr = {3, 2, 1, 56, 10000, 167};

        Pair result = getMinMax(arr);
        System.out.println("Minimum: " + result.min );
        System.out.println("Maximum: " + result.max );
    }

}
