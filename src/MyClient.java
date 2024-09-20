
import java.rmi.*;
import java.rmi.registry.*;

public class MyClient{
    public static void main(String[] args) throws RemoteException{
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",5000);
            Adder ad = (Adder)reg.lookup("hi_server");
            System.out.println("Addition:"+ad.Add(20,30));
        }
        catch(NotBoundException|RemoteException e){
            System.out.println(e);
        }
    }
}
