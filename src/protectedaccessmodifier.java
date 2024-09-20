public class protectedaccessmodifier extends Animal {
    public static void main(String[] args ){
        protectedaccessmodifier dog = new protectedaccessmodifier();
        dog.display();
    }
}
class Animal{
    protected void display(){
        System.out.println("I am a animal");
    }
}

