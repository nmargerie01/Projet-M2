
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

}

