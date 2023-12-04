import java.util.HashMap;
import java.util.Objects;

public class Teacher implements IRegister,IPerson{
    HashMap<String, Object> teacherMap = new HashMap();
    public HashMap<String, Object> signIn(HashMap<String, Object> hashMap){
        teacherMap.putAll(hashMap);
        System.out.println("Please input branch");
        teacherMap.put("Branch",Management.scanner.nextLine());
        System.out.println("Success register teacher");
        Management.scanner.close();
        return teacherMap;
    }
    public String grade(String name){
        if (Management.student.studentMap.containsValue(name) == false)
            return "Student is not found";
        else{
            Management.student.studentMap.put("Grade",100);
            return "Student is graded";
        }
    }
    public void forwarder(){
        System.out.println("Enter your desire process\nGive Homework / Grade");
        if (Objects.equals(Management.scanner.nextLine(),"Give Homework")){
            Management.student.studentMap.put("Homework","Solve test");
            System.out.println("Homework Given");
        }
        else if (Objects.equals(Management.scanner.nextLine(),"Grade")){
            System.out.println("Please input name graded student");
            System.out.println(grade(Management.scanner.nextLine()));
        }
    }
}
