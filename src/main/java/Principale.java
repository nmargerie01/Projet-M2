
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Principale {

    public static void main(String[] args) {

        String csvFile = "CatalogueRevetements.txt";
        String line;
        String cvsSplitBy = ";"; // Séparateur de colonnes
        
        ArrayList<String[]> listeRevetement = new ArrayList<>(); 

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] data = line.split(cvsSplitBy);

                if (data.length == 6) {
                    listeRevetement.add(data);
                } else {
                    System.out.println("Erreur: la ligne ne contient pas six colonnes");
                }
            }

            for (String[] rowData : listeRevetement) {
                for (String columnData : rowData) {
                    System.out.print(columnData + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


//Création de coins
        int reponsecoin;
        System.out.println(" Voulez vous créer un coin ? 1=oui et 0=non");
        reponsecoin=Lire.i();
        
        Coin c;
       
        //Déclaration de la ArrayList        
        ArrayList <Coin> listeCoin;
        
        //Initialisation de la liste
        listeCoin=new ArrayList<>();
       
        //Boucle de saisie et d'ajout de Coins dans la liste
        while(reponsecoin!=0){
            System.out.println("Identifiant:");
            int idc=Lire.i();
            System.out.println("Abscisse:");
            double ac=Lire.d();
            System.out.println("Ordonnée:");
            double bc=Lire.d();
            //Appel du constructeur pour créer une instance de Coin
            c=new Coin(idc,ac,bc);
            listeCoin.add(c);
            System.out.println("Création d'un coin: 1=oui 0=non");
            reponsecoin=Lire.i();}

        //Recherche d'un Coins dans listeCoins par son identifiant
        System.out.println("Identifiant du Coin recheché:");
        int idRechc=Lire.i();
        
        for (int i=0;i<listeCoin.size();i++)
        {     
            if (listeCoin.get(i).idCoin==idRechc)
             listeCoin.get(i).afficher();
        }
       
       
        int reponsemur;
        System.out.println(" Voulez vous créer un mur ? 1=oui et 0=non");
        reponsemur=Lire.i();
        Mur m;
        Coin am ,bm;
        am=new Coin(0,0,0);
        bm=new Coin(0,0,0);
        
              
        ArrayList <Mur> listeMur;
        listeMur=new ArrayList<>();
        
        while(reponsemur!=0){
            System.out.println("Identifiant:");
            int idm=Lire.i();
            System.out.println("Id du premier coin du mur:");
            int idam=Lire.i();
                for (int i=0;i<listeCoin.size();i++){     
                if (listeCoin.get(i).idCoin==idam)
                am = listeCoin.get(i);}
            System.out.println("Id du deuxième coin du mur");
            int idbm=Lire.i();
            System.out.println("Combien de fenetres sur ce mur ?");
                for (int i=0;i<listeCoin.size();i++){     
                if (listeCoin.get(i).idCoin==idbm)
                bm = listeCoin.get(i);}
            int fm=Lire.i();
            System.out.println("Combien de porte sur ce mur ?");
            int pm=Lire.i();
        //Appel du constructeur pour créer une instance de Murs
            m=new Mur(idm, am, bm, fm, pm);
            listeMur.add(m);
            System.out.println("Création d'un mur: 1=oui 0=non");
            reponsemur=Lire.i();}

        //Recherche d'un Murs dans listeMurs par son identifiant
        System.out.println("Identifiant du Mur recheché:");
        int idRechm=Lire.i();
        
        for (int i=0;i<listeMur.size();i++)
        {     
            if (listeMur.get(i).idMur==idRechm)
             listeMur.get(i).afficher();
        }

    }}



