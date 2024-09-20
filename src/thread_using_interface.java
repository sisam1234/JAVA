public class thread_using_interface {
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Threads is running");
    }
}
