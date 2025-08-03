import java.util.Scanner;
public class GCD {

    static int findGCD(int x , int y){
        if(y==0) {
            return x;
        }
            return findGCD( y , x%y);

            }


            public static void main(String[] args){
               Scanner sc = new Scanner(System.in);

              int x = Math.abs(sc.nextInt());
              int y = Math.abs(sc.nextInt());


                System.out.println(findGCD(x,y));
                System.out.println(findGCD(x,y));

            sc.close();
        }

          }






