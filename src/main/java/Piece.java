public class Piece {
    
    int idPiece;
    Sol sol;
    Plafond plafond;
    Mur mur1,mur2,mur3,mur4;
    
    Piece (int id, Sol sol, Plafond plafond, Mur mur1,Mur mur2,Mur mur3,Mur mur4){
        this.idPiece = id;
        this.sol = sol;
        this.plafond = plafond;
        this.mur1 = mur1; 
        this.mur2 = mur2;
        this.mur3 = mur3;
        this.mur4 = mur4;}
    
    public double surface() {
        double l,L,surface;
        double largeur =  Math.sqrt(((this.sol.getcoin1().x-this.sol.coin2.x)*(this.sol.coin1.x-this.sol.coin2.x))+((this.sol.coin1.y-this.sol.coin2.y)*(this.sol.coin1.y-this.sol.coin2.y)));
        double longueur = Math.sqrt(((this.sol.coin3.x-this.sol.coin2.x)*(this.sol.coin3.x-this.sol.coin2.x))+((this.sol.coin3.y-this.sol.coin2.y)*(this.sol.coin3.y-this.sol.coin2.y)));
        surface=longueur * largeur;
        return surface;}
    
}
