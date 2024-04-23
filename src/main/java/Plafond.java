
public class Plafond {

int idPlafond;
Coin coin1;
Coin coin2;
Coin coin3;
Coin coin4;
Revetement revplafond;

Plafond (int id,Coin a, Coin b, Coin c, Coin d, Revetement revplafond){
    this.idPlafond=id;
    this.coin1=a; 
    this.coin2=b;
    this.coin3=c;
    this.coin4=d;
    this.revplafond=revplafond;
    } 

@Override
    public String toString() {
        return "Plafond{" +
                "idPlafond=" + idPlafond +
                ", coin1=" + coin1 + 
                ", coin2=" + coin2 +
                ", coin3=" + coin3 +
                ", coin4=" + coin4 +
                ", revplafond=" + revplafond +
                '}';
    }
    
    public double Surface() {
        int a,b,c,d,e,f;
        double l,L,surface;
        a=listePlafond.get(idPlafond).coin1.cx;
        b=listePlafond.get(idPlafond).coin1.cy;
        c=listePlafond.get(idPlafond).coin2.cx;
        d=listePlafond.get(idPlafond).coin2.cy;
        e=listePlafond.get(idPlafond).coin3.cx;
        f=listePlafond.get(idPlafond).coin3.cy;
        l=Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d)));
        L=Math.sqrt(((e-c)*(e-c))+((f-d)*(f-d)));
        surface=l*L;
        return "Surface = "+surface;
    }
}

