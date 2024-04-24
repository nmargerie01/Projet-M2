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
    public ArrayList <Revetement> listeRevetement;


    public void creationcoin (){
        System.out.println("Identifiant:");
        int idc=Lire.i();
        System.out.println("Abscisse:");
        double ac=Lire.d();
        System.out.println("Ordonnée:");
        double bc=Lire.d();
        
        Coin c = new Coin(idc,ac,bc);
        listeCoin.add(c);}
        
    public void creationsol (){
        System.out.println("Identifiant:");
        int ids=Lire.i();
        System.out.println("Id du premier coin:");
        int idas=Lire.i();
        Coin as = recherchecoin(idas);
        System.out.println("Id du deuxième coin:");
        int idbs=Lire.i();
        Coin bs = recherchecoin(idbs);
        System.out.println("Id du troisieme coin:");
        int idcs=Lire.i();
        Coin cs = recherchecoin(idcs);
        System.out.println("Id du quatrieme coin:");
        int idds=Lire.i();
        Coin ds = recherchecoin(idds);
        System.out.println("Quel revetement (donner son Id) ?");
        int idrevetsol=Lire.i();
        Revetement revets = rechercherevetement(idrevetsol);
     
        Sol s = new Sol(ids, as, bs, cs, ds, revets);
        listeSol.add(s);}
    
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
    
   public void creationplafond (){
        System.out.println("Identifiant:");
        int idp=Lire.i();
        System.out.println("Id du premier coin:");
        int idap=Lire.i();
        Coin ap = recherchecoin(idap);
        System.out.println("Id du deuxième coin:");
        int idbp=Lire.i();
        Coin bp = recherchecoin(idbp);
        System.out.println("Id du troisieme coin:");
        int idcp=Lire.i();
        Coin cp = recherchecoin(idcp);
        System.out.println("Id du quatrieme coin:");
        int iddp=Lire.i();
        Coin dp = recherchecoin(iddp);
        System.out.println("Quel revetement (donner son Id) ?");
        int idrevetplafond=Lire.i();
        Revetement revetp = rechercherevetement(idrevetplafond);
     
        Plafond p = new Plafond(idp, ap, bp, cp, dp, revetp);
        listePlafond.add(p);} 
    
    public Coin recherchecoin (int id) {
        for (Coin coin : listeCoin) {
            if (coin.idCoin == id) {
                return coin;}}
        return null;}
    
    public Mur recherchemur (int id) {
        for (Mur mur : listeMur) {
            if (mur.idMur == id) {
                return mur;}}
        return null;}
    
    public Sol recherchesol (int id) {
        for (Sol sol : listeSol) {
            if (sol.idSol == id) {
                return sol;}}
        return null;}
    
    public Revetement rechercherevetement (int id) {
        for (Revetement revetement : listeRevetement) {
            if (revetement.idRevetement == id) {
                return revetement;}}
        return null;}
    
    public Piece recherchepiece (int id) {
        for (Piece piece : listePiece) {
            if (piece.idPiece == id) {
                return piece;}}
        return null;}
}




