//Transpose of 2d matrix 
import java.util.*;
public class array2d4 {
    static void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transpose(int[][] a,int r,int c){
        int[][] t=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[i][j]=a[j][i];
            }
        }
        printMatrix(t);
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
        System.out.println("Transpose Matrix :");
        transpose(m, r1, c1);
        sc.close();
    }
}
