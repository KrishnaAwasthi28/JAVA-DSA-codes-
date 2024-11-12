//Rat Maze Problems.

public class mazePath {
    public static int maze(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er || sc==ec) return 1;
        int down=maze(sr+1,sc,er,ec);
        int right=maze(sr,sc+1,er,ec);
        int total=down+right;
        return total;
    }    
    public static void main(String[] args) {
        System.out.println(maze(1,1,4,6));
    }
}
