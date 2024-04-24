import java.io.*;
import java.util.*;

public class Principale {

    public ArrayList <Coin> listeCoin = new ArrayList<>();
    public ArrayList <Mur> listeMur = new ArrayList<>();
    public ArrayList <Sol> listeSol = new ArrayList<>();
    public ArrayList <Plafond> listePlafond = new ArrayList<>();
    public ArrayList <Piece> listePiece = new ArrayList<>();
    public ArrayList <Appart> listeAppart = new ArrayList<>();
    public ArrayList <Niveau> listeNiveau = new ArrayList<>();
    public ArrayList <Immeuble> listeImmeuble = new ArrayList<>();

    public void creationcoin (){
        System.out.println("Identifiant:");
        int idc=Lire.i();
        System.out.println("Abscisse:");
        double ac=Lire.d();
        System.out.println("Ordonnée:");
        double bc=Lire.d();
        
        Coin c = new Coin(idc,ac,bc);
        listeCoin.add(c);}
        
    public void recherchecoin (){
        System.out.println("Identifiant du Coin recheché:");
        int idRechc=Lire.i();
            for (int i=0;i<listeCoin.size();i++){     
                if (listeCoin.get(i).idCoin ==idRechc){
                    listeCoin.get(idRechc).toString();}
                else {
                    System.out.println("Pas de coin correspondant");}}}
        
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
            if (listeMur.get(i).idMur==idRechm){
                listeMur.get(i).toString();}
            else {
                System.out.println("Pas de mur correspondant");}}}

}



