public class Array_demo{
    public static void main (String[] args){
        String bilgi1 = "Yunus";
        String bilgi2 = "233593091";
        System.out.println("amele gibi stringler oluşturulup bastırıldı");

        String[] bilgiler = new String[2];
        bilgiler[0] = bilgi1;
        bilgiler[1] = bilgi2;

        for (int i = 0; i < bilgiler.length; i++){
            System.out.println(bilgiler[i]);
        }

        for (String bilgi:bilgiler){
            System.out.println(bilgi);
        }
    }
}
