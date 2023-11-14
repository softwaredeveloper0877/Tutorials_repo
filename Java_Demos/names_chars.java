public class names_chars {
    public static void main (String[] args){
        char[][] elemanlar = {{'e','n','s','a','r'}, {'y', 'u', 'n', 'u', 's'},{'a', 'l'}};
        int i = 0;
        int index = 0;
            while (index <= elemanlar.length -1){
                System.out.print(elemanlar[index][i]);
                i++;
                if (i == 2){
                    System.out.println();
                    i = 0;
                    index++;
                }
            }
        }
    }
