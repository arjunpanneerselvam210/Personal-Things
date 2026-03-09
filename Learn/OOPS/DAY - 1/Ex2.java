import java.util.*;
class Student{
    String name;
    int rollNo;
    float marks;
}
public class Main{
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        Student s[] = new Student[3];
        for(int i = 0 ; i< 3 ; i++)
            s[i] = new Student();
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Enter the Student "+(i+1)+" Details");
            System.out.print("Name : ");
            s[i].name = ss.next();
            System.out.print("Roll No : ");
            s[i].rollNo = ss.nextInt();
            System.out.print("Marks : ");
            s[i].marks = ss.nextFloat();
        }
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Student :"+i+1);
            System.out.println("Name : "+s[i].name+" Roll No : "+s[i].rollNo+" Marks : "+s[i].marks);
        }
    }
}
