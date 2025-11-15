//Spiral Matrix Traversal
import java.util.*;
public class array2d7 {
    static void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiral(int[][]a,int r,int c){
        int toprow=0,botrow=r-1,rightcol=c-1,leftcol=0,te=0;
        while(te<r*c){
            for(int j=leftcol;j<=rightcol && te<r*c;j++){
                System.out.print(a[toprow][j] + " ");
                te ++;
            }
            toprow++;
    
            for(int i=toprow;i<=botrow && te<r*c;i++){
                System.out.print(a[i][rightcol]+ " ");
                te++;
            }
            rightcol--;
    
            for(int j=rightcol;j>=leftcol && te<r*c;j--){
                System.out.print(a[botrow][j] + " ");
                te++;
            }
            botrow--;
    
            for(int i=botrow;i>=toprow && te<r*c;i--){
                System.out.print(a[i][leftcol] + " ");
                te++;
            }
            leftcol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns of Matrix :");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter "+r1*c1+" elements of Matrix :");
        int[][] m=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix :");
        printMatrix(m);
        System.out.println("Spiral Traversal ");
        spiral(m, r1, c1);
        sc.close();
    }
}
