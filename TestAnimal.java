import java.util.Scanner;

abstract class Animal {
  protected int legs;

  protected Animal(int legs) {
    this.legs = legs;
  }

  public void walk(int legs) {
    System.out.println("Numbers of legs :" + legs);
  }

  public abstract void eat();
}

class Spider extends Animal {

  Spider() {
    super(8);
  }

  public void eat() {
    System.out.println("Spider eat insects");
  }
}

interface Pet {
  public String getName();

  public String setName(String Name);

  public void play();
}

class Cat extends Animal implements Pet {
  String Name;

  Cat(String name) {
    super(4);
    this.Name = name;
  }

  public void eat() {
    System.out.println("Cat eat fishes");
  }

  public String setName(String name) {
    Name = name;
    return name;
  }

  public String getName() {
    return Name;
  }

  public void play() {
    System.out.println("Cat sounds mew mew");
  }

  public void walk(int legs) {
    System.out.println("Numbers of legs" + legs);
  }
}

class Fish extends Animal implements Pet {

  Fish() {
    super(0);
  }

  public void eat() {
    System.out.println(Name + " eat plants");
  }

  String Name;

  public String setName(String name) {
    Name = name;
    return name;
  }
  public String getName() {
    return Name;
  }

  public void walk() {
    System.out.println(Name + " has no legs.");
  }
  public void play(){
    System.out.println("Fish making bubbles");
  }
}


public class TestAnimal {

  public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
Fish d = new Fish();
System.out.println("Enter the Fish name :");
String f = sc.nextLine();
        d.setName(f);
        System.out.println("This fish's name is : "+d.getName());
        d.eat();
        d.walk();
 String ca = sc.nextLine();
Cat c = new Cat(ca);
System.out.println("Enter the Cat name :");
        c.setName(ca);
        System.out.println("This cat's name is : "+c.getName());
        c.eat();
        c.walk(4);
Animal a = new Fish();
System.out.println("Enter the Fish name :");
String  a1 = sc.nextLine();
        ((Fish)a).setName(a1);
        System.out.println("This fish's name is : "+((Fish)a).getName());
    }
}
