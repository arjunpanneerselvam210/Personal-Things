import java.util.*;
class Player{
    String name;
    String country;
    String skill;
}
public class Main{
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        Player p1 = new Player();
        
        System.out.println("Enter the player's name : ");
        p1.name = ss.nextLine();
        
        System.out.println("Enter the country name : ");
        p1.country = ss.nextLine();
        
        System.out.println("Enter the skill : ");
        p1.skill = ss.nextLine();
        
        System.out.println("Player Details : ");
        System.out.println("Player Name : "+p1.name);
        System.out.println("Country Name : "+p1.country);
        System.out.println("Skill : "+p1.skill);
    }
}


