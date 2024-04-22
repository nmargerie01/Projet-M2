
import java.io.*;
import java.util.*;

public class Revetement {

int idRevetement;
String designation; 
boolean pourMur;
boolean pourSol; 
boolean pourPlafond; 
double prixUnitaire;

Revetement (int id, String nom, boolean mur, boolean sol, boolean plafond, double prix){
    this.idRevetement = id ;
    this.designation = nom ; 
    this.pourMur = mur ;
    this.pourSol = sol ; 
    this.pourPlafond = plafond ; 
    this.prixUnitaire = prix ;
    }

ArrayList<Revetement> listeRevetement = new ArrayList<>(); 

try
{
File csvFile = new File ("CatalogueRevetements.txt");
FileReader fr = new FileReader(csvFile);
BufferedReader br = new BufferedReader(fr);  
String line; 
while((line = br.readLine()) != null){
    String[] parties = line.split(";");
    int id = parties[0].toInt();
    String nom = parties[1];
    boolean mur = parties[2];
    boolean sol = parties[3];
    boolean plafond = parties[4];
    double prix = parties[5];
}
fr.close();
}
catch(FileNotFoundException err){
    System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}
catch(IOException err){
System.out.println(" Erreur :\n "+err);}
        

String[] parties = line.split(";");
    partie1 = parties[0];
    partie2 = parties[1];