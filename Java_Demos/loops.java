public class loops {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }
        System.out.println("For dongusu bitti");
        int i = 0;
        while (i < 10)
        {
            System.out.println("i = "+ i);
            i++;
        }
        System.out.println("While dongusu bitti");
        i = 0;
        do {
            i++;
            System.out.println("i = "+ i);
        }
        while(i < 10);
        System.out.println("Do-While dongusu bitti");
    }
}
