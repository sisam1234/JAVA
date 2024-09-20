public class baseclass_using_super {
    public static void main(String[] args){
        ChildClass c = new ChildClass();
    }
}
class BaseClass{
    BaseClass(){
        System.out.println("Base Class constructor is called");
    }
}
class ChildClass extends BaseClass{
    ChildClass(){
        super();
        System.out.println("From base class constructor");
    }
}