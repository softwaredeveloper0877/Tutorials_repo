public class Recap_demo {

    public static void main(String[] args){
	int sayi1 = 20;
	int sayi2 = 900000;
	int sayi3 = 999999999;
	int EnBuyuk = 0;

	if (EnBuyuk < sayi1)
	{
		EnBuyuk = sayi1;
	}

	if (EnBuyuk < sayi2)
	{
		EnBuyuk = sayi2;
	}

	if (EnBuyuk < sayi3)
	{
		EnBuyuk = sayi3;
	}
	System.out.println("En buyuk sayi = " + EnBuyuk);
    }
}
