public class Pow {
    static int Pow(int p, int q) {
    if(q==0) return 1;

        int smallPow = Pow(p, q / 2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;

    }


    public static void main(String[] args) {
        System.out.println(Pow(5,6));
    }
}