import java.util.*;
public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]a=new int[r][c];
        System.out.println("Enter "+r*c+" elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
