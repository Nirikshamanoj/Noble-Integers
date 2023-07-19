import java.util.Arrays;
import java.util.Scanner;
public class NobleInteger {
    static void findNobleInteger(int[] A,int n)
    {
        Arrays.sort(A);
        int countOfSmall=0,countOfNoble=0;
        if(A[0]==0)
            countOfNoble++;
        for(int i=1;i<n;i++) {
            if (A[i] != A[i - 1]) {
                countOfSmall = i;
            }
            if (countOfSmall == A[i]) {
                countOfNoble++;
            }
        }
        System.out.println(countOfNoble);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        findNobleInteger(A,n);
    }
}
