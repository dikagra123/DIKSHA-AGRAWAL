public class NumberToWord {
    public static String getNumberWord(int number) {
        String result;

        switch (number) {

            case 1:
                result = "One";
                break;
            case  2:
            result = "Two";
            break;
            case 3:
            result = "Three";
            break;
            case 4:
            result = "Four";
            break;
            case 5:
            result = "Five";
            break;
            case 6:
            result = "Six";
            break;
            case 7:
            result = "Seven";
            break;
            case 8:
            result = "Eight";
            break;
            default:
            result = "Unknown";
        }

        return result;

    }
    public static void main(String[] args){
        int number = 3;
        System.out.println(getNumberWord(number));

        }

    }

