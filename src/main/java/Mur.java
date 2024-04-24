public class Mur {
    int idMur;
    Coin CoinDebut;
    Coin CoinFin;
    int nbFenetre;
    int nbPorte;
    Revetement revetmur;
    
    Mur (int id,Coin a,Coin b,int f,int p, Revetement revetmur){
        this.idMur=id;
        this.CoinDebut=a;
        this.CoinFin=b;
        this.nbFenetre=f;
        this.nbPorte=p;
        this.revetmur=revetmur;} 
    
    public double surface(){
        double h = hauteursousplafond;
        int f=this.nbFenetre;
        int p=this.nbPorte;
        double d=Math.sqrt(((this.CoinDebut.x-this.CoinFin.x)*(this.CoinDebut.x-this.CoinFin.x))+((this.CoinDebut.y-this.CoinFin.y)*(this.CoinDebut.y-this.CoinFin.y)));
        double surface=((d*h)-((f*1.44)+(p*1.68)));
        return surface;}
    
    public double montantrevetement(){
        double montant = this.revetmur.prixUnitaire*this.surface();
        return montant;}
}



