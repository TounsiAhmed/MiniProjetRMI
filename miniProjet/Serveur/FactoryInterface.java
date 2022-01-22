

import java.rmi.*;
public interface FactoryInterface extends Remote {
    public MultiplicationInterface cell(int i,int j) throws RemoteException;
}
