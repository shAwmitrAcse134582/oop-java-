import java.util.Scanner;
 /// 1. creating Animal class (abstract )//
   abstract class Animal {
   protected int legs ;
   protected Animal(int legs)
    {
        this.legs = legs;
    }

   public void walk(int legs)
    { 
      System.out.println("no of legs is "+legs+" so it can walk properly");   
    } 
       public abstract void eat();
}
//2. creating Spider class that extends Animal class//
 class Spider extends Animal {

    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("spider eat insects");
    }
	public void walk()
    { 
      System.out.println("no of legs is " +8+ " so it can walk properly");   
    } 
}
//3. creating pet (interface) class //
 interface Pet {
   
    public String getName();
    public String setName(String Name);
    public void play();
   
}
//4. creating cat class that extends animal & implements pet//

 class Cat extends  Animal implements Pet {
         String Name;
      public Cat (String name)
      {  
          super(4);
          this.Name = name;   
      }
      public Cat ()
      {
         super(4);
          this.Name = " ";  
      }
      //@Override //
      @Override 
      public void eat()
      {
         System.out.println("The Cat "+Name+" eat fishes"); 
      }    
      
      //pet implementation...
  public String setName(String name)
   {   
          Name = name; 
          return null;
   }
  public String getName()
  {
      return Name;
  }
  
  public void play()
  {
      System.out.println("The cat "+Name+" plays ");
  }
  @Override
  public void walk(int legs)
    { 
      System.out.println("no of legs is "+legs+" so it can walk properly");   
    } 
}


//5. creating fish class that extends animal & implements pet//
   class Fish extends Animal implements Pet{
    
    public Fish()
    {
        super(0);
    }
    @Override
    public  void eat()
  {
    System.out.println(""+Name+" eat plants");
  }
     String Name; 
 public String setName(String name)
   {   
          Name = name; 
          return null;
   }
 
  public String getName()
 {
    return Name;
 }
public void walk()
{
System.out.println(""+Name+" has no legs, so it can't walk");
} 
@Override
  public void play()
  {
      System.out.println("The fish "+Name+" plays ");
  }
  }
public class TestAnimals{

    public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  
//object initialization &calling method of fish 
Fish d = new Fish();
System.out.println("Enter the Fish name :");
String f = sc.nextLine();
        d.setName(f);
        System.out.println("This fish's name is "+d.getName());
        d.eat();
        d.walk();
		d.play();
 //object initialization &calling methodof cat 
Cat c = new Cat();
System.out.println("Enter the Cat name :");
String ca = sc.nextLine();
        c.setName(ca);
        System.out.println("This cat's name is "+ c.getName());
        c.eat();
        c.walk(4);
     //object initialization &calling method of Animal as animal1
Animal a = new Fish();
System.out.println("Enter the Fish(Animal) name :");
String  a1 = sc.nextLine();
       ((Fish)a).setName(a1);
       System.out.println("The (Animal) fish's name is "+ ((Fish)a).getName());
        ((Fish)a).eat();
        ((Fish)a).walk();
Animal e = new Spider();
//System.out.println("Enter the Spider(Animal) name :");
//String  e1 = sc.nextLine();
       //((Spider)e).setName(e1);
       //System.out.println("The (Animal) Spider's name is "+ ((Spider)e).getName());
        ((Spider)e).eat();
        ((Spider)e).walk();
		
		Pet p = new Cat();
System.out.println("Enter the cat(pet) name :");
String  p1 = sc.nextLine();
       ((Pet)p).setName(p1);
       System.out.println("The (pet) cat's name is "+ ((Pet)p).getName());
        //((Pet)p).eat();
        //((Pet)p).walk();
		((Pet)p).play();		
}
}

