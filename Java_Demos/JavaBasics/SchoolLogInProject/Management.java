import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Management implements IRegister {
    static Student student = new Student();
    static Teacher teacher = new Teacher();
    static Scanner scanner = new Scanner(System.in);
    HashMap<String, Object> person = new HashMap();

    public HashMap<String, Object> signIn(HashMap<String, Object> person) {
        System.out.println("Please input your name");
        person.put("Name", scanner.nextLine());
        System.out.println("Please input your age");
        person.put("Age", scanner.nextInt());
        System.out.println("Please input id number");
        person.put("TC", scanner.nextLong());
        System.out.println("Controlling input info's");
        scanner.nextLine();
        return person;
    }

    public IRegister hwoIsPerson(int age) {
        if (age <= 18)
            return student;
        else
            return teacher;
    }

    public void logIn(String name, long TC) {
        if (student.studentMap.get("Name") == name && (long) student.studentMap.get("TC") == TC)
            student.forwarder();
        else if (teacher.teacherMap.get("Name") == name && (long) teacher.teacherMap.get("TC") == TC) {
            teacher.forwarder();
        }
    }

    public void forwarder() {
        String answer = "";
        System.out.println("Enter your desire process\nSign In / Log In");
        answer = scanner.nextLine();
        try{
            if (Objects.equals(answer, "Sign In"))
                hwoIsPerson((int) signIn(person).get("Age")).signIn(person);
            else if (Objects.equals(answer, "Log In")) {
                System.out.println("Please input name");
                String name = scanner.nextLine();
                System.out.println("Please input id");
                long id = scanner.nextLong();
                logIn(name, id);
            }
        }catch (Exception exception){
            System.out.println("Wrong Text");
            forwarder();
        }
    }
}