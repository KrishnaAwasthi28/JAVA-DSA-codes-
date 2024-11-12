// //addition of two matrices  
// import java.util.*;
// public class array2d1 {
//     static void printMatrix(int[][] m){
//         for(int i=0;i<m.length;i++){
//             for(int j=0;j<m[i].length;j++){
//                 System.out.print(m[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     static void add(int[][] a,int r1,int c1,int[][]b,int r2,int c2){
//         if(r1!=r2 || c1!=c2){
//             System.out.println("Invalid Input - Addition not possible ");
//             return;
//         }
//         int[][] sum=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c2;j++){
//                 sum[i][j]=a[i][j] + b[i][j];
//             }
//         }
//         printMatrix(sum);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the rows and columns of Matrix 1 :");
//         int r1=sc.nextInt();
//         int c1=sc.nextInt();
//         System.out.println("Enter the rows and columns of Matrix 2 :");
//         int r2=sc.nextInt();
//         int c2=sc.nextInt();
//         int[][]m1=new int[r1][c1];
//         int[][]m2=new int[r2][c2];
//         System.out.println("Enter "+r1*c1+" elements of Matrix 1 ");
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 m1[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("Enter "+r2*c2+" elements of Matrix 2 ");
//         for(int i=0;i<r2;i++){
//             for(int j=0;j<c2;j++){
//                 m2[i][j]=sc.nextInt();
//             }
//         }
//         add(m1, r1, c1, m2, r2, c2);
//         sc.close();
//     }
// }

public class array2d1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
    }
}
