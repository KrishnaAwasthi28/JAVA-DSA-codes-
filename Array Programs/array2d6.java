import java.util.*;
public class array2d6 {
    static void printMatrix(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rotation(int[][] a,int r,int c){
        int[][] t=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[i][j]=a[j][i];
            }
        }
        for(int i=0;i<r;i++){
            int start=0;
            int end=c-1;
            while(start<end){
                int temp=t[i][start];
                t[i][start]=t[i][end];
                t[i][end]=temp;
                start ++;
                end --;
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
        int[][] arr=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix :");
        printMatrix(arr);
        System.out.println("Rotation Matrix :");
        rotation(arr, r1, c1);
        sc.close();
    }
}
