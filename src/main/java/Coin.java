import java.util.ArrayList;

public class Coin {
    int idCoin;
    double cx, cy;
    
    Coin (int id,double abscisse, double ordonnee){
        this.idCoin=id;
        this.cx=abscisse;
        this.cy=ordonnee;   
}
   
ArrayList <Coin> listeCoin = new ArrayList<>();

void afficher (){
    System.out.println("L'identifiant de ce coin est : "+this.idCoin);
    System.out.println("L'abcisse de ce coin est : "+this.cx);
    System.out.println("L'ordonnee de ce coin est : "+this.cy);
}

@Override
    public String toString() {
        return "Coin{" +
                "idCoin=" + idCoin +
                ", cx=" + cx +
                ", cy=" + cy +
                '}';
    }
}
