abstract class Utilities {
    abstract void display();
}
public class abstract_class {
    public static void main(String[] args) throws Exception{
        Utilities u = new Utilities() {
            void display(){
                System.out.println("Good Mornong");
            }
        };
        u.display();
    }
}
