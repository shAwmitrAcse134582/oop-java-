import java.util.Scanner;


abstract class Animal {
    public abstract void eat();

}
public class Dog extends Animal{
    public void eat()
    {
        System.out.println("The dog is eating");
    }
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);

    dog name = new dog();


    System.out.println("Name: ");
    String nametype = input.nextLine();

   name.setNameSelected(nametype);
      System.out.println(name.getName());

        Animal obj = new Dog();
        obj.eat();
    }
}
