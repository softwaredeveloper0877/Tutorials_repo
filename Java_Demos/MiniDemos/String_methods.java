public class String_methods {
    public static void main(String[] args) {
        String[] message = {"    Bugun hava cok guzel.    "};
        String ex = "Bugun hava cok guzel.";
        System.out.println("Eleman sayisi = " + message.length); // lenght burada bir değişkendir ve bu kullanımı array lere özeldir. Array in eleman sayısını verir.
        System.out.println("Elemanin uzunlugu = " + message[0].length()); // length burada metottur. Stringler için kullanılır. mesage dizisinin 0. elemanı bir String dir. String in karakter uzunluğunu verir.
        System.out.println("5.Eleman = " + message[0].charAt(4)); // .charAt() metodu verilen String in parametre olarak verilen indis numarasının ait olduğu karakteri döndürür.
        System.out.println(message[0].concat(" Yasasin!")); // .concat() metodu geçici olarak verilen stringin sonuna parametre olarak verilen stringi ekler. Kalıcı olması için bie değişkene atamak gerekir
        System.out.println(message[0].startsWith("B")); // .startsWith() metodu verilen String in parametre olarak verilen String ile başlayıp başlamadığını kontrol eder ve sonucu boolean olarak döndürür.
        System.out.println(message[0].endsWith(".")); //.endsWith() metodu verilen String in parametre olarak verilen String ile bitip bitmediğini kontrol eder ve sonucu boolean olarak döndürür.
        char[] deneme = new char[5];
        ex.getChars(0, 5, deneme, 0); // .getChars() metodu verilen string in parametre olarak verilen indisleri arasındaki karakterleri yine parametre olarak verilen char dizisinin belirtilen başlangıç indisinden başlayarak kopyalar.
        System.out.println(deneme);
        System.out.println(message[0].indexOf("av")); // .indexOf() metodu verilen String içerisinde parametre olarak verilen string i String in başından başlayarak arar ve String i ilk bulduğu yerin başlangıç indisini döndürür.
        System.out.println(message[0].lastIndexOf("a")); // .lastIndexof() metodu verilen String içerisinde parametre olarak verilen karakteri String in sonundan başlayarak arar ve String i ilk bulduğu yerde başlangıca göre olan indisi döndürür.
        System.out.println(message[0].replace("Bugun", "") + "Yarin"); // .replace() metodu veriilen String in içerisinde parametre olarak verilenn String i arar ve bulduğunda yine parametre olarak verilen String ile değiştirir.
        System.out.println(message[0].substring(0, message[0].length())); // .substring() metodu verilen stringin parametre olarak verilen indislerin aralığındaki karakterleri alır.

        for (String kelime : message[0].split(" ")){
            System.out.println(kelime);
        }
        System.out.println(message[0].toLowerCase());
        System.out.println(message[0].toUpperCase());
        System.out.println(message[0].trim());
    }
}