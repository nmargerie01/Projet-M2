import java.io.*;
import java.util.*;

public class Revetement {

    int idRevetement;
    String designation;
    boolean pourMur;
    boolean pourSol;
    boolean pourPlafond;
    double prixUnitaire;

    Revetement(int id, String nom, boolean mur, boolean sol, boolean plafond, double prix) {
        this.idRevetement = id;
        this.designation = nom;
        this.pourMur = mur;
        this.pourSol = sol;
        this.pourPlafond = plafond;
        this.prixUnitaire = prix;
    }

        ArrayList<Revetement> listeRevetement = new ArrayList<>();
        File csvFile = new File("CatalogueRevetements.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parties = line.split(";");
                int id = Integer.parseInt(parties[0]);
                String nom = parties[1];
                boolean mur = Integer.parseInt(parties[2]) == 1;
                boolean sol = Integer.parseInt(parties[3]) == 1;
                boolean plafond = Integer.parseInt(parties[4]) == 1;
                double prix = Double.parseDouble(parties[5]);

                Revetement r = new Revetement(id, nom, mur, sol, plafond, prix);
                listeRevetement.add(r);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : le fichier n’existe pas! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erreur de lecture du fichier: " + e.getMessage());
        }
        return listeRevetement;
    

    

    @Override
    public String toString() {
        return "Revetement{" +
                "idRevetement=" + idRevetement +
                ", designation='" + designation + '\'' +
                ", pourMur=" + pourMur +
                ", pourSol=" + pourSol +
                ", pourPlafond=" + pourPlafond +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }
}

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


File csvFile = new File ("CatalogueRevetements.txt");
try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parties = line.split(";");
                int id = Integer.parseInt(parties[0]);
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

                Revetement r = new Revetement(id, nom, mur, sol, plafond, prix);
                listeRevetement.add(r);
            }
  