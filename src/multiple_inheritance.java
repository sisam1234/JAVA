

public class multiple_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.sound();       
        dog.play();        
               
    }
}
abstract class Animal {
    abstract void sound();
}
abstract class Like{
    abstract void eat();
}
interface Pet {
    void play();
}
inte


class Dog extends Animal implements Pet {
    
    void sound() {
        System.out.println("Dog barks");
    }

   
    public void play() {
        System.out.println("Dog plays");
    }

   
}


