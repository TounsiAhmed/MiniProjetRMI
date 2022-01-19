package Serveur;


import java.rmi.*;


public class Serveur {
    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://Factory",new Factory());
            System.out.println("Serveur pret");
        } catch (Exception e) {
            System.out.println("Erreur serveur"+e);
        }
    }
}
