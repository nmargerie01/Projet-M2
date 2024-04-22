
import java.util.ArrayList;


public class Principale {

    public static void main(String[] args) {

    System.out.println("Que voulez vous faire : Créer (1), Modifier (2), Supprimer (3)");
    int voeu ;
    voeu=Lire.i();
    
    if (voeu == 1){
        
    


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
        
        //Déclaration de la ArrayList        
        ArrayList <Mur> listeMur;
        //Initialisation de la liste
        listeMur=new ArrayList<>();
        //Boucle de saisie et d'ajout de Murs dans la liste
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

    }}}



