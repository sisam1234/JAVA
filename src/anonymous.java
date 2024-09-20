public class anonymous {
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                System.out.println("Thread is running");
            }
        };
        t.start();
    }
}
