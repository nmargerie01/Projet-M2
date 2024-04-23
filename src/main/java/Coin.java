public class Coin {
 
int idCoin;
double cx, cy;
    
Coin (int id,double a, double b){
    this.idCoin=id;
    this.cx=a;
    this.cy=b;   
}
    
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
