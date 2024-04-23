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
   
    public double surface (idMur,idNiveau);
    int a,b,c,e,h,f,p;
    double d, surface;
    a=listeMur.get(idMur).Coindebut.cx;
    b=listeMur.get(idMur).Coindebut.cy;
    c=listeMur.get(idMur).Coindebut.cx;
    e=listeMur.get(idMur).Coindebut.cy;
    h=listeNiveau.get(idNiveau).Hauteursousplafond;
    f=listeMur.get(idMur).nbFenetre;
    p=listeMur.get(idMur).nbPorte;
    d=Math.sqrt(((a-c)*(a-c))+((b-e)*(b-e)));
    surface=((d*h)-((f*1.44)+(p*1.68));

}



