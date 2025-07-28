import java.util.Scanner;
public class HollowSquare {
    public static void printSquare(int s){

        for(int i =0;i<s;i++) {
         for(int j =0;j<s;j++) {

             if(i==0 || i == s-1 || j ==s-1 || j==0){
                 System.out.print("*");

             }else{
                 System.out.print(" ");
             }
         }

         System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int s = scanner.nextInt();
        printSquare(s);
        scanner.close();
    }
}
