public class inter_thread_commu {
    public static void main(String[] args) throws Exception{
        Customer c =new Customer();
        Thread t1 = new Thread(){
            public void run(){
                c.withdraw(120000);
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                c.deposit(100000);
            }
        };
        t2.start();
    }
}
class Customer{
    int amt = 100000;
    synchronized void withdraw(int amt){
        System.out.println("going to withdraw");
        if(this.amt<amt){
            System.out.println("Less balance; waiting for deposit.....");
            try{
                wait();
            }
            catch(Exception e){}
        }
        this.amt-= amt;
        System.out.println("withdraw completed");
    }
    synchronized void deposit(int amt){
        System.out.println("going to deposit");
        this.amt+=amt;
        System.out.println("deposit completed");
        notify();
    }
}
