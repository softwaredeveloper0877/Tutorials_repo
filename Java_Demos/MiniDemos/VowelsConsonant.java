public class VowelsConsonant {
    public static void Char(char CHAR) {
        if ((int) CHAR < 65 || (int) CHAR > 90) {
            System.out.println("please input one english upper case");
        } else {
            switch (CHAR) {
                case 'A', 'I', 'O', 'U':
                    System.out.println("Input char is low vowel(" + CHAR + ")");
                    break;
                case 'E':
                    System.out.println("Input char is thin vowel(" + CHAR + ")");
                    break;
                default:
                    System.out.println("Input char is consonant(" + CHAR + ")");
                    break;
            }
        }
    }
}