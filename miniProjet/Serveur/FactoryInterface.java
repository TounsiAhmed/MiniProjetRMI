

import java.rmi.*;
public interface FactoryInterface extends Remote {
    public Multiplication cell(int i,int j) throws RemoteException;
}
