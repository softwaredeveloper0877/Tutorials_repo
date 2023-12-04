import java.util.HashMap;

public class Student implements IRegister,IPerson{
    HashMap<String, Object> studentMap = new HashMap();
    public HashMap<String, Object> signIn(HashMap<String, Object> hashMap){
        studentMap.putAll(hashMap);
        System.out.println("Please input class name");
        studentMap.put("class",Management.scanner.nextLine());
        System.out.println("Please input student number");
        studentMap.put("Student Number",Management.scanner.nextLine());
        System.out.println("Success register student");
        forwarder();
        return studentMap;
    }
    public void forwarder(){
        System.out.println("Enter your desire process\nGrade");
        if (Management.scanner.nextLine() == "Grade"){
            System.out.println("Please input the lesson you want to see the grade for.");
            String branch = Management.scanner.nextLine();
            grade(branch);
        }
    }

    public String grade(String branch){
        if (branch == Management.teacher.teacherMap.get("Branch"))
            return (String) studentMap.get("Grade");
        else
            return "Grade not found in this lesson";
    }
}