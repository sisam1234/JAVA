public class method_overriding {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.displayInfo();
    }
}
class Animal{
    public void displayInfo(){
        System.out.println("I am an animal.");
    }
}
class Dog extends Animal{
    @Override
    public void displayInfo(){
        System.out.println("I am a dog");
    }
}