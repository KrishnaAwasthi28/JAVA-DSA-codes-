//reverse each row of a 2d array 
import java.util.*;
public class array2d3 {
    static void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverserow(int[][] a,int r1,int c1){
        for(int i=0;i<r1;i++){
            int start=0;
            int end=c1-1;
            while(start<end){
                int temp=a[i][start];
                a[i][start]=a[i][end];
                a[i][end]=temp;
                start ++;
                end --;
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and columns :");
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
        System.out.println("Reversed Matrix :");
        reverserow(m, r1, c1);
        sc.close();
    }
}
