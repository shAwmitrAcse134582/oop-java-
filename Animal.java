import java.util.Scanner;

public class Animal
{
       public static void main(String args[])
       {
               Scanner scan= new Scanner(System.in);
               System.out.println("Enter the number of Animal:");
               int n = scan.nextInt();

               for (int i = 0; i <n;i++)
               {
                       String name,residence,food,color;

                       System.out.println("Enter Animal name:");
                       name = scan.next();
                       System.out.println("Name:"+name);

                       System.out.print("Residence:");
                       residence = scan.next();
                       System.out.println("Residence:"+residence);

                       System.out.print("Food:");
                       food = scan. next();
                       System.out.println("Food:"+food);

                       System.out.print("Color:");
                       color = scan. next();
                       System.out.println("Color:"+color);

                       System.out.print("\n");



               }

       }
}
