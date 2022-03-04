import java.util.Scanner;
public class ifelseprogram {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value here: ");
        int a=sc.nextInt();
        System.out.println("Enter second value here: ");
        int b=sc.nextInt();
        if (a>b){
            System.out.println(a+" Is greater than"+b);
            
        }else {
            System.out.println(b+" Is greater than "+a);
        }

    }
    
}
