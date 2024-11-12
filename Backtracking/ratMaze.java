//Rat maze problem - rat can move in4 directions - up,down,right,left

public class ratMaze{
    public static void main(String[] args) {
        int row=3,col=3;
        boolean[][] isVisited=new boolean[row][col];
        print(0,0,row-1,col-1,"",isVisited);
    }

    private static void print(int sr, int sc, int er, int ec,String s, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return; 
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        //go right
        print(sr, sc+1, er, ec,s+"R", isVisited);
        //go down
        print(sr+1, sc, er, ec,s+"D", isVisited);
        //go left
        print(sr, sc-1, er, ec,s+"L", isVisited);
        //go up
        print(sr-1, sc, er, ec,s+"U", isVisited);
        //Backtracking
        isVisited[sr][sc]=false;

    }
}