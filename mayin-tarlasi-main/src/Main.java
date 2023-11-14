import java.util.Random;
import java.util.Scanner;

class MineSwepper{
    int row;
    int col;
    String[][] MineMap;
    String[][] GameMap;
    int mine;
    int r;
    int c;
    int count;
    boolean isTrue = true;

    public MineSwepper(int row, int col) {
        this.row = row;
        this.col = col;
        this.GameMap = new String[row][col];
        this.MineMap = new String[row][col];
        this.mine = (row * col) / 4;
    }

    public void MineMap(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                MineMap[i][j] = "-";
                GameMap[i][j] = "-";

            }
        }

    }

    public void randomNumber() {
        Random r = new Random();
        for (int i = 0; i < this.mine; i++) {
            int rnum = r.nextInt(this.row);
            int rnum2 = r.nextInt(this.col);
            if (!this.MineMap[rnum][rnum2].equals("*")) {
                this.MineMap[rnum][2] = "*";
            }
        }
    }

    // In this scope, comment lines print the mine map on the screen.
    // Therefore, if you want to see the mine map, you should remove the codes from the comment line.

    public void printMineMap() {
        //  System.out.println("Location of Mines");
        randomNumber();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (!this.MineMap[i][j].equals("*")) {
                    this.MineMap[i][j] = "-";
                }
//                System.out.print(this.MineMap[i][j] + " ");
            }
//            System.out.println();
        }
    }

    public void printGameMap(){
        for(int i=0; i < this.row; i++){
            for(int j=0; j<this.col; j++){
                this.GameMap[i][j]="-";
                System.out.print(this.GameMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void control(){
        count=0;
        for(int i=(r-1); i <= (r+1); i++){
            for (int j = (c-1); j <= (c+1); j++) {
                if(i<0 || j<0 || i >= this.row || j >= this.col){
                    continue;
                }
                if(this.MineMap[i][j].equals("*")){
                    count++;
                }
            }
        }
        this.GameMap[r][c] = String.valueOf(count);
        this.MineMap[r][c] = String.valueOf(count);
        for(int i=0; i< this.row; i++){
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.GameMap[i][j]+" ");
            }
            System.out.println();
        }

    }

    public boolean finish() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.MineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void ChooseIndex(){
        Scanner sc = new Scanner(System.in);
        isTrue = false;
        while(!isTrue){
            System.out.print("Enter row: ");
            r = sc.nextInt();
            System.out.print("Enter column: ");
            c = sc.nextInt();

            r-=1; // We set the entered number equal to the index number of the array.
            c-=1;

            if(r>this.row || c>this.col ){
                System.out.println("You entered a value outside the map boundaries. Enter again.");
                continue;
            }
            if(MineMap[r][c].equals("*")){
                System.out.println("Game Over!");
                for (int i = 0; i < this.row; i++) {
                    for (int j = 0; j < this.col; j++) {
                        if (!this.MineMap[i][j].equals("*")) {
                            this.MineMap[i][j] = "-";
                        }
                            System.out.print(this.MineMap[i][j] + " ");
                    }
                        System.out.println();
                }
                break;
            }
            control();
            if(finish()){
                System.out.println("Congratulations! You win.");
                break;
            }

        }
    }

    public void run(){
        System.out.println("Welcome to Minesweeper Game!");
        MineMap();
        printMineMap();
        printGameMap();
        ChooseIndex();
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column of the array: ");
        int col = sc.nextInt();

        MineSwepper mineSwepper = new MineSwepper(row,col);
        mineSwepper.run();


    }
}
