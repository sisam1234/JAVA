public class privateconstructor_singletonpatttern {
    public static void main(String [] args){
        SingletonClass  s = SingletonClass.ObjectCreationMethod();
        s.display();
    }
}
class SingletonClass{
    private static SingletonClass obj = null;
    private SingletonClass(){}
    public static SingletonClass ObjectCreationMethod(){
        if (obj==null) {
            obj = new SingletonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("singleton class example");
    }
}
