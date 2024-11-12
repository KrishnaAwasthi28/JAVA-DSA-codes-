import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class josepbprblm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int winner=joseph(n,k);
        System.out.println(winner);
        sc.close();
    }
    public static int joseph(int noOfPeople,int remPosition){
        int tempPos=remPosition -1;
        int[] people=new int[noOfPeople];
        for(int i=0;i<noOfPeople;i++){
            people[i]=i+1;
        }
        int iteration=noOfPeople-1;
        List<Integer> list=IntStream.of(people).boxed().collect(Collectors.toList());
        while(iteration>0){
            list.remove(tempPos);
            tempPos +=remPosition-1;
            if(tempPos>list.size()-1){
                tempPos=tempPos % list.size();
            }
            iteration --;
        }
        return list.get(0);
    }
}
