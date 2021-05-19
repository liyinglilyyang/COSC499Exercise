import java.util.Scanner;

class even
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Please Enter An Integer:");
    Scanner number = new Scanner(System.in);
    num = number.nextInt();
    if ( num % 2 == 0 )
        System.out.println("Even");
     else
        System.out.println("Odd");
  }
}
