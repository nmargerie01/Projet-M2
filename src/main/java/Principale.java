import java.io.*;
import java.util.*;

public class Principale {

    public static void main(String[] args) {

    ArrayList <Mur> listeMur = new ArrayList<>();
    ArrayList <Sol> listeSol = new ArrayList<>();
    ArrayList <Plafond> listePlafond = new ArrayList<>();
    ArrayList <Piece> listePiece = new ArrayList<>();
    ArrayList <Appart> listeAppart = new ArrayList<>();
    ArrayList <Niveau> listeNiveau = new ArrayList<>();
    ArrayList <Immeuble> listeImmeuble = new ArrayList<>();



    public void creationcoin (){
        System.out.println("Identifiant:");
        int idc=Lire.i();
        System.out.println("Abscisse:");
        double ac=Lire.d();
        System.out.println("Ordonnée:");
        double bc=Lire.d();
        
        Coin c = new Coin(idc,ac,bc);
        listeCoin.add(c);}
        
    sta

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
        
              
        ArrayList <Mur> listeMur = new ArrayList<>();
        
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



