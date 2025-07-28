import javax.swing.*;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {20, 34, 56, 78, 23, 56, 47, 78, 57};
        int x = 27;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {

                flag =true;
                break;

            }
        }

        if (flag == false)

            System.out.println("not found");

        else
            System.out.println("found");

        }
    }



