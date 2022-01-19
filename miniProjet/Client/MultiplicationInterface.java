import java.rmi.*;

public interface MultiplicationInterface extends Remote{
    public int  produit(int[][] m1, int[][] m2, int c) throws RemoteException;
}