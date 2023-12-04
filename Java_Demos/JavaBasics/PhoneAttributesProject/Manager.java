public class Manager {
    public static void add (Attributes attributes){ // burada metoda parametre olarak Attributes class ına ait bir nesne alacağını tanımlamış olduk
        System.out.println("Urun eklendi '" + attributes.getPhone_name() + "'"); // aldığımız nesneyi kullanarak phone name değişkenine erişim sağladık.
    }
}
