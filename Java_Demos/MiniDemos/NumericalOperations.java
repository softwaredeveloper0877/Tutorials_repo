public class NumericalOperations {
    public static void operations(int number1, int number2) {
        String primeMessage = isPrimeNumber(number1);
        String primeMessage1 = isPrimeNumber(number2);
        String perfectMessage = isPerfectNumber(number1);
        String perfectMessage1 = isPerfectNumber(number2);
        String friendMessage = isFriendsNumber(number1,number2);
        String totalMessage = primeMessage + "\n" + primeMessage1 + "\n" + perfectMessage + "\n" + perfectMessage1 + "\n" + friendMessage + "\n";
        System.out.println(totalMessage);
    }

    public static String isPrimeNumber(int current_number) {
        int counter = 0;

        do {
            counter++;
            if (current_number % counter == 0 && counter != 1 && counter != current_number || current_number < 0)
                return "Input number is not prime number(" + current_number + ")";
        }
        while (counter < current_number / 2);
        return ("Input number is prime number(" + current_number + ")");
    }

    public static String isPerfectNumber(int number) {
        //perfect numbers
        // 6 -> 1,2,3 => 1+2+3 = 6
        //28 -> 1,2,4,7,14 => 1+2+4+7+14 = 28
        // friends numbers 220-284
        int total = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number)
            return ("Input number is perfect number(" + number + ')');

        else
            return ("Input number is not perfect number(" + number + ')');
    }

    public static String isFriendsNumber(int number1, int number2) {
        int total1 = 0;
        int total2 = 0;
        if (number1 == number2) {
            return ("Please input different numbers for I find is friend numbers");
        }
        for (int i = 1; i <= number1 / 2; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i <= number2 / 2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }

        if (total1 == number2) {
            if (total2 == number1)
                return ("Input numbers is friends numbers");
        }

        return ("Input numbers is not friends numbers");
    }
}