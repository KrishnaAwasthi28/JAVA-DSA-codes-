//In a maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1. A rat can move only in active blocks.

public class ratMaze2 {
    public static void main(String[] args) {
        int row=3;
        int col=4;
        int[][] maze={{1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1}};
        print(0,0,row-1,col-1,"",maze);
    }
    private static void print(int sr, int sc, int er, int ec,String s,int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return; 
        if(maze[sr][sc]==-1) return;
        if(maze[sr][sc]==0) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        maze[sr][sc]=-1;
        //go right
        print(sr, sc+1, er, ec,s+"R",maze);
        //go down
        print(sr+1, sc, er, ec,s+"D",maze);
        //go left
        print(sr, sc-1, er, ec,s+"L",maze);
        //go up
        print(sr-1, sc, er, ec,s+"U",maze);
        //Backtracking
        maze[sr][sc]=1;

    }
}
