
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
    int id = 0;
    String nom = "";
    boolean mur = false;
    boolean sol = false;
    boolean plafond = false;
    double prix = 0;
    
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

fr.close();
}
catch(FileNotFoundException err){
System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}
catch(IOException err){
System.out.println(" Erreur :\n "+err);}
}
    
    
    String line;
    while((line = br.readLine()) != null){
				if (start == true) {
					line = line.replace(">","$>$");
					line = line.replace("<","$<$");
					d = analyserLigne(line, i, action_left, reright, instruction_right, d, offset); 
					i=i+1;
				}
				else if (line.contains("Debut")) {
					start = true;
				}		
			}
			
	
	System.out.println("\\end{tikzpicture}\n\\end{document}");

    
    
try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
    while ((line = br.readLine()) != null) {
        String[] data = line.split(cvsSplitBy);
        if (data.length == 6) {
            listeRevetement.add(data);
        } 
        else {
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

}