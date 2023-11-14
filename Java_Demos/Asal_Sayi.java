public class Asal_Sayi{
    public static void main(String[] args){
        int number = 25;
        int remainder = number % 2;

        boolean isPrime = true;

        for (int i = 2; i<number; i++){
            if (number % 2 == 0){
                isPrime = false;
            }

            if (isPrime){
                System.out.println("number is prime number");
            }
            else
                System.out.println("number is not prime number");
        }
    }
}