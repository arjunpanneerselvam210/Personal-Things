package CLASS;

import java.util.*;
class Store{
    String prod;
    int quant;
}
public class day1{
    public static void main(String[] args){
        
        Scanner ss = new Scanner(System.in);
        
        Store ob1 = new Store();
        ob1.prod = ss.nextLine();
        ob1.quant = ss.nextInt();
        ss.nextLine(); // clear buffer
        
        System.out.println("Product : " + ob1.prod+"Quantity : "+ob1.quant);
        
        Store ob2 = new Store();
        ob2.prod = ss.nextLine();
        ob2.quant = ss.nextInt();
        ss.nextLine();	// clear buffer
        
        System.out.println("Product : " + ob2.prod+"Quantity : "+ob2.quant);
        
        Store ob3 = new Store();
        ob3.prod = ss.nextLine();
        ob3.quant = ss.nextInt();
        
        System.out.println("Product : " + ob3.prod+"Quantity : "+ob3.quant);
    }
}
