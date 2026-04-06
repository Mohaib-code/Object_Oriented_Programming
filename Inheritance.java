public class Inheritance {
    public static void main (String args[]){
        // Bird b1=new Bird();
        // b1.eat();
        // b1.fly();
        Dog pup=new Dog();
        pup.eat();

    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eating ....");
    }
    void breate(){
        System.out.println("Breathe ...");
    }
}

// class Bird extends Animal{
// int leg;
// void fly(){
//     System.out.println("Flying ...");
// }
// }

class Mammals extends Animal{
  int size;  
}
class Dog extends Mammals{
    String breed;{
    System.out.println("KUKU");}
}