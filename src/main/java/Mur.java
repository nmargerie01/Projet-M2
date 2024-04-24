public class Mur {
    int idMur;
    Coin CoinDebut;
    Coin CoinFin;
    int nbFenetre;
    int nbPorte;
    // idRevetement;
    
    Mur (int id,Coin a,Coin b,int f,int p){
        this.idMur=id;
        this.CoinDebut=a;
        this.CoinFin=b;
        this.nbFenetre=f;
        this.nbPorte=p;
        //this.idRevetement=e;    
    } 
    
    void afficher (){
    System.out.println("L'identifiant de ce mur est : "+this.idMur+ ", il relie les coins "+this.CoinDebut.idCoin+" et "+this.CoinFin.idCoin+". Il comporte "+this.nbFenetre+" fenetres et "+this.nbPorte+" portes.");
    }
   
    public double surface (){
        double h = hauteursousplafond;
        int f=this.nbFenetre;
        int p=this.nbPorte;
        double d=Math.sqrt(((this.CoinDebut.x-this.CoinFin.x)*(this.CoinDebut.x-this.CoinFin.x))+((this.CoinDebut.y-this.CoinFin.y)*(this.CoinDebut.y-this.CoinFin.y)));
        double surface=((d*h)-((f*1.44)+(p*1.68)));
        return surface;}
}



