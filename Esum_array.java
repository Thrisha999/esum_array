//Esum_Osum_array
import java.util.Scanner;
class Array
{
   int a[]= new int[50];
   void display(int n)
   {
     int i,esum=0,osum=0;
     Scanner ar=new Scanner(System.in);
     System.out.println("enter array elements: ");
     for(i=0;i<=n;i++)
     {
       a[i] = ar.nextInt();
     }
     for(i=0;i<=n;i++)
     {
       if(a[i]%2==0)
       {
         esum=esum+a[i];
       }
       else
       {
         osum=osum+a[i];
       }
     }
     System.out.println("sum of even no.s= "+esum);
     System.out.println("sum of odd no.s= "+osum);
   }

}
public class Esum_array
{
  public static void main(String[] args)
  {
     int n;
     Scanner in=new Scanner(System.in);
     System.out.println("enter the value of n");
     n=in.nextInt();
     Array sum= new Array();
    sum.display(n);
  }
}
