public class thread {
    public static void main(String[] args){
        Mythread t = new  Mythread();
        t.start();
    }
}
class Mythread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
