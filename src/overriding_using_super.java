public class overriding_using_super {
    public static void main(String[] args) throws Exception {
        ChildClass obj=new ChildClass();
        obj.myMethod();
    }
}
class ABC{
    public void myMethod(){
        System.out.println("Overridden Method");
    }
}
class ChildClass extends ABC{
    public void myMethod(){
        super.myMethod();
        System.out.println("Child class");
    }
}