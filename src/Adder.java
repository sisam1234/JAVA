import java.rmi.*;
public interface Adder extends Remote{
    public int Add(int x, int y) throws RemoteException;
}