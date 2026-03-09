import java.util.*;
class Student{
    String name;
    int rollNo;
    float marks;
}
public class Main{
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        Student[] s = new Student[3];
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Enter the Student "+i+1+" Details");
            s[i].name = ss.nextLine();
            ss.nextLine();
            s[i].rollNo = ss.nextInt();
            s[i].marks = ss.nextFloat();
        }
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Student :"+i+1);
            System.out.println("Name : "+s[i].name+" Roll No : "+s[i].rollNo+" Marks : "+s[i].marks);
        }
    }
}
