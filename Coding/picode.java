import java.util.Scanner;
public class picode {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float pi = 22/7;
        System.out.println("Enter the radius: ");
        float r =sc.nextFloat();
        System.out.println("The circle of the area: "+pi*r);
    }
    
}
