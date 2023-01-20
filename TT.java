abstract class Animal{
   //abstract method
   public abstract void sound();
}
//Dog class extends Animal class
 class Dog extends Animal{

   public void sound(){
	System.out.println("Woof");
   }
}
   public class TT{
	   
   public static void main(String args[]){
	//Dog obj = new Dog();
	//Animal obj = new Animal();
	obj.sound();
   }
}