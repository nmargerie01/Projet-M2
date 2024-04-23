import java.io.*;
import java.util.*;

public class Principale {

    ArrayList <Coin> listeCoin = new ArrayList<>();
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
        
    public String recherchecoin (){
        System.out.println("Identifiant du Coin recheché:");
        int idRechc=Lire.i();
            for (int i=0;i<listeCoin.size();i++){     
                if (listeCoin.get(i).idCoin==idRechc){
                    return listeCoin.get(i).toString();}}}
        
    public void creationmur (){
        System.out.println("Identifiant:");
        int idm=Lire.i();
        System.out.println("Id du premier coin du mur:");
        int idam=Lire.i();
        Coin am = new Coin(0,0,0);
            for (int i=0;i<listeCoin.size();i++){     
            if (listeCoin.get(i).idCoin==idam)
            am = listeCoin.get(i);}
        System.out.println("Id du deuxième coin du mur");
        int idbm=Lire.i();
        Coin bm = new Coin(0,0,0);
            for (int i=0;i<listeCoin.size();i++){     
            if (listeCoin.get(i).idCoin==idbm)
            bm = listeCoin.get(i);}
        System.out.println("Combien de fenetres sur ce mur ?");
            int fm=Lire.i();
        System.out.println("Combien de porte sur ce mur ?");
            int pm=Lire.i();
        
        Mur m = new Mur(idm, am, bm, fm, pm);
        listeMur.add(m);}
    
    public void recherchemur (){
        System.out.println("Identifiant du Mur recheché:");
        int idRechm=Lire.i();
        for (int i=0;i<listeMur.size();i++){     
            if (listeMur.get(i).idMur==idRechm)
                listeMur.get(i).afficher();}}

}



