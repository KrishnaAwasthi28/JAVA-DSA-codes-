// 1234567
// 2345671
// 3456712
// 4567123
// 5671234
// 6712345
// 7123456
// public class prog7 {
// public static void main(String[] args) {
//     int i,j;
//     for(i=1;i<=7;i++){
//         for(j=i;j<=7;j++){
//             System.out.print(j);
//         }
//         for(int k=1;k<=i-1;k++){
//             System.out.print(k);
//         }
//         System.out.println();
//     }
// }
// }

//Pattern 2
public class prog7 {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            for(j=1;j<=6;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}