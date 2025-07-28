public class CountNumber {
    public static void main(String[] args) {
        int[] arr = {23,4,56,10,78,89,12};

        int num = 12;
        int count=0;
        for(int i=0;i<arr.length;i++) {

            if (arr[i] > num) {
                count++;
            }
        }

                System.out.println("Number of elements greater than " + num + " = " + count);


            }
        }

