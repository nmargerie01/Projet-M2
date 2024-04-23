
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
    int id = Integer.valueOf(parties[0]);
    String nom = parties[1];
    if (Integer.valueOf(parties[2]) == 0){
        boolean mur = false;}
    if (Integer.valueOf(parties[2]) == 1);{
        boolean mur = true;}
    if (Integer.valueOf(parties[3]) == 0);{
        boolean sol = false;}
    if (Integer.valueOf(parties[3]) == 1);{
        boolean sol = true;}
    if (Integer.valueOf(parties[4]) == 0);{
        boolean plafond = false;}
    if (Integer.valueOf(parties[4]) == 1);{
        boolean plafond = true;}
    double prix = Double.parseDouble(parties[5]);
    Revetement r = new Revetement (id, nom, mur, sol, plafond, prix);
    listeRevetement.add(r);      
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