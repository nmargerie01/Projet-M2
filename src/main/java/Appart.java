import java.io.*;
import java.util.*;

public class Appart {
   
    int idAppart,idNiveauAppartement;
    ArrayList<Piece> pieces = new ArrayList<> ();
    
    Appart (int id, int niveau, ArrayList<Piece> pieces){
        this.idAppart = id;
        this.idNiveauAppartement = niveau;
        this.pieces = pieces;}
    
    public double surface(){
        double surface = 0;
        for (int i=0;i<this.pieces.size();i++){     
            surface = surface + this.pieces.get(i).surface();}
        return surface;}
    
    public double montantrevetement(){
        double montant = 0;
        for (int i=0;i<this.pieces.size();i++){     
            montant = montant + this.pieces.get(i).montantrevetement();}
        return montant;}
}

