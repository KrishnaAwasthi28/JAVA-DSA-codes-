//Pattern 1
// ******
// ******
// ******
// public class prog6 {
//     public static void main(String[] args) {
//         int i,j;
//         for(i=0;i<3;i++){
//             for(j=0;j<6;j++){
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//     }
// }

//Patter 2
// ******
// *    *
// *    *
// ******
// import java.util.*;
// public class prog6 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the rows and columns :");
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int i,j;
//         for(i=0;i<r;i++){
//             for(j=0;j<c;j++){
//                 if((i==0 || i==r-1 )|| (j==0 || j==c-1)){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 3
// *
// **
// ***
// ****
// *****
// import java.util.*;
// public class prog6 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n :");
//         int n=sc.nextInt();
//         int i,j;
//         for(i=0;i<n;i++){
//             for(j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Pattern 4
// *****
// ****
// ***
// **
// *
import java.util.*;
public class prog6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n=sc.nextInt();
        int i,j;
        for(i=n;i>=0;i--){
            for(j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Pattern 5
//     *
//    ***
//   *****
//  *******
// *********
// import java.util.*;
// public class prog6 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int i,j,k;
//         for(i=0;i<n;i++){
//             for(j=0;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(k=0;k<2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }