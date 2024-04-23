import java.util.ArrayList;

public class Coin {
    int idCoin;
    double x, y;
    
    public Coin (int id,double x, double y){
        this.idCoin=id;
        this.x=x;
        this.y=y;}

    public int getIdCoin() {
        return idCoin;}

    public double getX() {
        return x;}

    public double getY() {
        return y;}

    ArrayList <Coin> listeCoin = new ArrayList<>();

@Override
    public String toString() {
        return "Coin{" +
                "idCoin=" + idCoin +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
