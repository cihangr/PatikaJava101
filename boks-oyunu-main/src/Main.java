
public class Main {
    public static void main(String[] args) {
        Fighter maria = new Fighter("MARIA",165,88,80,70,75,160,35, 65);
        Fighter dessy = new Fighter("DESSY",167,65,80,90,85,120,55, 85);
        Fighter tina = new Fighter("TINA",175,75,85,80,90,180,30, 75);
        Fighter krissi = new Fighter("KRISSI",162,95,85,60,65,140,20, 55 );
    Match R1 = new Match(maria,dessy,60,100);
    Match R2 = new Match(maria,tina,60,100);
    Match R3 = new Match(maria,krissi,60,100);
    Match R4 = new Match(dessy,tina,60,100);
    Match R5 = new Match(dessy,krissi,60,100);
    Match R6 = new Match(tina,krissi,60,100);

    R1.run();

    }
}
