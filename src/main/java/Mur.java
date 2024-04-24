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
    int a,b,c,e,h,f,p;
    double d, surface;
    a=this.CoinDebut.getx();
    b=this.CoinDebut.y;
    c=this.CoinDebut.x;
    e=this.CoinDebut.y;
    //h=hauteursousplafond;
    f=this.nbFenetre;
    p=this.nbPorte;
    d=Math.sqrt(((a-c)*(a-c))+((b-e)*(b-e)));
    surface=((d*h)-((f*1.44)+(p*1.68)));
    return surface;}
}



