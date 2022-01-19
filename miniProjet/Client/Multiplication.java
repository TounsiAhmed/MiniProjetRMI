
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
public class Multiplication extends UnicastRemoteObject implements MultiplicationInterface {
    private int i;
    private int j;

    public Multiplication(int i, int j) throws RemoteException{
        super();
        this.i=i;
        this.j=j;
    }
    public int  produit(int[][] m1,int[][] m2,int c) throws RemoteException{
        int result=0;
        for(int k=0; k<c; k++){
            result+=m1[i][k]*m2[k][j];
        }
        return result;
    }
}
