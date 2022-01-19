

import java.rmi.server.UnicastRemoteObject;

import java.rmi.*;
public class Factory extends UnicastRemoteObject implements FactoryInterface{
    public Factory() throws RemoteException{
        super();
    }
    public Multiplication cell(int i,int j) throws RemoteException{
        return new Multiplication(i, j);
    }  
}
