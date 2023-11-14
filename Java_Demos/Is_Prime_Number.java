public class Is_Prime_Number {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please input a valid integer");
            System.exit(0);
        }

        int current_number = Integer.parseInt(args[0]);
        int counter = 0;

        do {
            counter++;
            if (current_number % counter == 0 && counter != 1 && counter != current_number || current_number < 0) {
                System.out.println("Input number is not prime number(" + current_number + ")");
                break;
            } else {
                System.out.println("Input number is prime number(" + current_number + ")");
                break;
            }
        }
        while (counter < current_number / 2);
    }
}