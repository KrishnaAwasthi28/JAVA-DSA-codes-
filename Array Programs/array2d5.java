//transpose of matrix without using a new array 
import java.util.*;
public class array2d5 {
    static void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposePlace(int[][] a,int r ,int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
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
        System.out.println("Transpose Matrix :");
        transposePlace(m, r1, c1);
        printMatrix(m);
        sc.close();
    }
}
