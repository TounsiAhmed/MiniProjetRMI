import java.util.Scanner;
import java.rmi.*;
public class Client {

    public static void afficherMatrice(int[][] m,int ligne, int colonne){
        for(int i=0;i<ligne;i++)
        {
            for(int j=0;j<colonne;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int lA,lB,cA,cB;
        
        Scanner In=new Scanner(System.in); 

        //dimension des matrices
        do
       { 
            System.out.print("Nombre de ligne de la matrice A: ");     
            lA=In.nextInt();
            System.out.print("Nombre de colonne de la matrice A: ");
            cA=In.nextInt();
            System.out.print("Nombre de ligne de la matrice B: ");     
            lB=In.nextInt();
            System.out.print("Nombre de colonne de la matrice B: ");
            cB=In.nextInt();
            System.out.println();
            if (cA!=lB) System.out.println("On ne peut pas multiplier ces matrices");
        } while (cA!=lB);
        System.out.println("La matrice resultat sera de taille  "+lA+" x "+cB);

        int [][] A = new int[lA][cA];
        int [][] B = new int[lB][cB];
        int [][] res = new int[lA][cB];
        
        //insertion des matrices
        System.out.println("Inserer A:");
        System.out.println();
            for(int i=0;i<lA;i++)
            {
                for(int j=0;j<cA;j++)
                {
                    System.out.print("A ["+i+","+j+"] = ");
                    A[i][j]=In.nextInt();
                }
            }
        System.out.println();    
        System.out.println("Inserer B:");
        System.out.println();
        for(int i=0;i<lB;i++)
        {
            for(int j=0;j<cB;j++)
            {
                System.out.print("B ["+i+","+j+"] = ");
                B[i][j]=In.nextInt();
            }        
        }
        System.out.println();
        In.close();

        //Calcul de la matrice resultat
        try {
            FactoryInterface Fac= (FactoryInterface)Naming.lookup("rmi://127.0.0.1:1099/Factory");
            for (int i=0; i<lA; i++){
                for (int j=0; j<cB; j++){
                    res[i][j]=Fac.cell(i,j).produit(A,B,cA);
                }
            }
        } catch (Exception e) { 
            System.out.println("Erreur calcul "+e);    
        }

        //Affichage de la matrice resultat

        System.out.println("La multiplication de ");
        System.out.println();
        afficherMatrice(A, lA, cA);
        System.out.println("X");
        afficherMatrice(B, lB, cB);
        System.out.println();
        System.out.println("Resultat: ");
        System.out.println();
        afficherMatrice(res, lA, cB);
        /*for(int i=0;i<lA;i++)
        {
            for(int j=0;j<cB;j++)
            {
                System.out.print(res[i][j]+" ");
            }    
            System.out.println();            
        }*/
           
    }
    
}
