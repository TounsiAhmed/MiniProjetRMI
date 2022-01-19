
import java.rmi.*;
public class Serveur {
    public static void main(String[] args) {
        try {
            Factory fabrique= new Factory();
            Naming.rebind("Factory",fabrique);
            System.out.println("Serveur pret");
        } catch (Exception e) {
            System.out.println("Erreur serveur"+e);
        }
    }
}
