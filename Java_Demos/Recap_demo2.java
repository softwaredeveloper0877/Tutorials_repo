public class Recap_demo2{
    public static void main (String[] args){
        double[] myList = {1.2, 9.5, 6.7 ,8.9};
        double total = 0;
        double max = 0;
        for (double number:myList){// for içinde oluşturulan number değişkeni her döngü çalıştığında array in bir diğer elemanının değerine eşit olur
            if (max < number){
                max = number;
            }
            total += number;
        }
        System.out.println("Toplam = "+total);
        System.out.println("maximum deger = "+ max);
    }
}