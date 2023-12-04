public class chars {
    public static void printName(int number) {
        char[] name = {'Y', 'U', 'N', 'U', 'S'};
        VowelsConsonant.Char(name[number]);
        if (number < name.length - 1) {
            printName(number + 1);
        }
        else
            System.out.print(name);
    }
}
