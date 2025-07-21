import java.util.Scanner;

public class ContinuousOnes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<N;i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1,0,0,1,0,1,1,1,1,0};
        int N = arr.length;
        int lengthOfOnes=0;int count = 0;
        for(int i=0;i<N;i++){
            if(arr[i]==1){
                count++;
            }
            else {
                count=0;
            }
            lengthOfOnes = Math.max(lengthOfOnes,count);
        }
        System.out.println(lengthOfOnes);
    }
}
