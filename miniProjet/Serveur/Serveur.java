
import java.rmi.*;
public class Serveur {
    public static void main(String[] args) {
        try {
            Factory fabrique= new Factory();
            Naming.rebind("rmi://127.0.0.1:1099/Factory",fabrique);
            System.out.println("Serveur pret");
        } catch (Exception e) {
            System.out.println("Erreur serveur"+e);
        }
    }
}
