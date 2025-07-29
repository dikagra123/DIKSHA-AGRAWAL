class FIZZBUZZ {
    public static void main(String[] args) {
        FIZZBUZZ sol = new FIZZBUZZ();
        String[] result = sol.fizzBuzz(15);
        for (String str : result) {
            System.out.println(str);
        }
    }

    public String[] fizzBuzz(int n) {
        String[] answer = new String[n];

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                answer[i - 1] = "FizzBuzz";

            } else if (i % 3 == 0) {
                answer[i - 1] = "Fizz";

            } else if (i % 5 == 0) {
                answer[i - 1] = "Buzz";

            } else {
                answer[i - 1] = Integer.toString(i);
            }
        }

        return answer;
    }
}


