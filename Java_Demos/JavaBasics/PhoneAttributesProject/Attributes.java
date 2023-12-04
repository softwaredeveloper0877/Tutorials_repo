public class Attributes {
    public Attributes(String phone_name, int phone_memory, int phone_camera){
        this.phone_name = phone_name;
        this.phone_memory = phone_memory;
        this.phone_camera = phone_camera;

        // Bu blok constructor bloğudur. Ve bu bloğu kullanmk için class nesnesini new lerken parametreleri de girmek gerekir örneğin;
        // Attributes attributes = new Attributes("Iphone 6", 256, 21); gibi.
    }

    public Attributes(){} // Bu blokta method overloading işlemi yapılmıştır. Bu işlemin amacı aynı ada ve özelliklere sahip metotlar oluştururken parametrelerini ve işlevlerini farklı vererek duruma göre istenilen metodu kullanmaktır.
    // Constructor blokları yazılmasa bile yukarıdaki gibi var kabul edilir.
    private String phone_name;
    private int phone_memory;
    private int phone_camera;

    public String getPhone_name() {
        return phone_name;
    }

    public void setPhone_name(String phone_name) {
        this.phone_name = phone_name;
    }

    public int getPhone_memory() {
        return phone_memory;
    }

    public void setPhone_memory(int phone_memory) {
        this.phone_memory = phone_memory;
    }

    public int getPhone_camera() {
        return phone_camera;
    }

    public void setPhone_camera(int phone_camera) {
        this.phone_camera = phone_camera;
    }

    // burada oluşturulan değişkenler class içerisindeki bütün metotlarda, aynı proje içerisindeki bütün class larda kullanılabilmektedir sebebi ise herhangi bir metot içerisinde tanımlanmadan direkt class içinde tanımlanmasıdır.
    // Bu yapılan işleme field veya attribute denir.
}
