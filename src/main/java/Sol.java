public class Sol {
    int idSol;
    Coin coin1;
    Coin coin2;
    Coin coin3;
    Coin coin4;
    Revetement revsol;

    Sol (int id,Coin a, Coin b, Coin c, Coin d, Revetement revsol){
        this.idSol=id;
        this.coin1=a; 
        this.coin2=b;
        this.coin3=c;
        this.coin4=d;
        this.revsol=revsol;} 

    @Override
    public String toString() {
        return "Sol{" +
                "idSol=" + idSol +
                ", coin1=" + coin1 + 
                ", coin2=" + coin2 +
                ", coin3=" + coin3 +
                ", coin4=" + coin4 +
                ", revsol=" + revsol +
                '}';
    }
    
    public double surface() {
        double l,L,surface;
        l=Math.sqrt(((this.coin1.x-this.coin2.x)*(this.coin1.x-this.coin2.x))+((this.coin1.y-this.coin2.y)*(this.coin1.y-this.coin2.y)));
        L=Math.sqrt(((this.coin3.x-this.coin2.x)*(this.coin3.x-this.coin2.x))+((this.coin3.y-this.coin2.y)*(this.coin3.y-this.coin2.y)));
        surface=l*L;
        return surface;}
    
    public double montantrevetement(){
        double montant = this.revsol.prixUnitaire*this.surface();
        return montant;}
}
