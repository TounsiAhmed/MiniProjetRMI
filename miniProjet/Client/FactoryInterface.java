package Client;

import java.rmi.*;


import Serveur.Multiplication;
public interface FactoryInterface extends Remote {
    public Multiplication cell(int i,int j) throws RemoteException;
}
