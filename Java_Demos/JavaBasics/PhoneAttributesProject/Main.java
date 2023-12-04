public class Main {
    public static void main (String[] args){
        Attributes attributes = new Attributes(); // Burada Attributes class ındaki verilere erişebilmek için bir class nesnesi oluşturuldu.
        attributes.setPhone_name("Iphone 6"); // Burada oluşturulan nesne üzerinden class içindeki değişkene setter kullanarak değeri verildi.
        attributes.setPhone_memory(256);
        attributes.setPhone_camera(21);
        Manager.add(attributes); // Buradaki Manager class ının add metodu static olduğundan dolayı (dışarıdan erişilebildiğinden dolayı) class nesnesi oluşturulmadan direkt class ismi verip metod çağırıldı

    }
}
