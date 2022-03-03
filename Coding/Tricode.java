import java.util.Scanner;

public class Tricode {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter length: ");
      int l=sc.nextInt();
      System.out.println("enter height: ");
      int b=sc.nextInt();
      System.out.println("Enter breadth: ");
      int h=sc.nextInt();
      System.out.println("The perimeter of triangle--"+ (l+b+h));
      System.out.println("The area of triangle--"+ (l*b*h));

  }   
}
