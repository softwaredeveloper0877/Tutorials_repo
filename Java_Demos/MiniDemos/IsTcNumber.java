import java.util.InputMismatchException;
import java.util.Scanner;

public class IsTcNumber {
    public static void main(String[] args) {
        make();
    }

    public static boolean genTC(int total, String TC) {
        try {
            int lastNumber = Integer.parseInt(String.valueOf(TC.charAt(TC.length() -1)));
            if (total % 10 == lastNumber) {
                return true;
            } else
                return false;
        } catch (InputMismatchException exception) {
            return false;
        }
    }

    public static int calculate(String TC) {
        int tmp = 0;
        if (TC.length() == 11 && TC.charAt(0) != '0' && Integer.parseInt(String.valueOf(TC.charAt(TC.length() -1))) % 2 == 0) {
            for (int i = 0; i <= TC.length() -2; i++) {
                int count = Integer.parseInt(String.valueOf(TC.charAt(i)));
                tmp = count + tmp;
            }
        }
        return tmp;
    }

    public static String messaging(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your TC number");
        String TC = scanner.nextLine();
        return TC;
    }

    public static void make(){
        String TC = messaging();
        int total = calculate(TC);
        boolean isTrue = genTC(total,TC);
        if (isTrue == true)
            System.out.println("Entered number is TC number");
        else{
            System.out.println("Entered number is not TC number");
            make();
        }
    }
}

