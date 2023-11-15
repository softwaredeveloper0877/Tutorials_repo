public class chars {
    public static void printName (int number){
        char[] name = {'Y', 'U', 'N', 'U', 'S'};
        System.out.print(name[number]);
        if (number < name.length - 1)
            printName(number + 1);
    }
}
