//Multiplication of two matrix 
import java.util.*;
public class array2d2 {
    static void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][]a,int r1,int c1,int[][]b,int r2,int c2){
        // if(c1!=r2){
        //     System.out.println("Multiplication impossible !!");
        //     return;
        // }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns of Matrix 1 :");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the rows and columns of Matrix 2 :");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if(c1==r2){
            System.out.println("Enter "+r1*c1+ " elements of Matrix 1 :");
            int[][] m=new int[r1][c1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    m[i][j]=sc.nextInt();
                }
            }
        
            System.out.println("Enter "+r2*c2+ " elements of Matrix 1 :");
            int[][] m2=new int[r1][c1];
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    m2[i][j]=sc.nextInt();
                }
            }
            System.out.println("Matrix 1 :");
            printMatrix(m);
            System.out.println("Matrix 2 :");
            printMatrix(m2);
            System.out.println("Multiplication of two matrix  ");
            multiply(m, r1, c1, m2, r2, c2);
        }
        else{
            System.out.println("Multiplication Invalid :");
        }
        sc.close();
    }
}
