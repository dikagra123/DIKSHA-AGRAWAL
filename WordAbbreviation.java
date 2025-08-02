import java.util.Scanner;
public class WordAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            String word = scanner.next();

            if (word.length() > 10) {

                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                int middleCount = word.length() - 2;

                System.out.println(firstChar + String.valueOf(middleCount) + lastChar);
            } else {
                System.out.println(word);
            }

        }
        scanner.close();
    }

}
