public  class constructorchaining{
    public static void main(){
        Animal a = new Animal();
    }
}
class Animal{
    Animal(){
       
       this("samriddhi");
       System.out.println("this is a dog");

        
    }
    Animal(String str){
        System.out.println("this is a this keyword");
    }
}