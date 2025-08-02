public class SOD {

    static int sod(int n){
        //base class
        if(n>=0 && n<=9){
            return n;
        }
        //recursive work
        int smallAns = sod(n/10);

        //self work

        return smallAns + n%10;
}

public static void main(String[] args){
        System.out.println(sod(1234));
    }
}
