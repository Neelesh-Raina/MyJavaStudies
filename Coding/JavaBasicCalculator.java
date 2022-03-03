import java.util.Scanner;

public class JavaBasicCalculator{
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number here-");
        int a= sc.nextInt();
        System.out.println("Enter Second Number-");
        int b= sc.nextInt();
        int q= a+b;
        int w= a-b;
        int e= a*b;
        int r= a/b;
        int t= a*a;
        int y= b*b;
        System.out.println("Sum-"+q);
        System.out.println("Sub-"+w);
        System.out.println("Multiply-"+e);
        System.out.println("divide-"+r);
        System.out.println("Sqaure of first number:"+t);
        System.out.println("Square of second number:"+y);
        
        
        


        
    }
    
}
