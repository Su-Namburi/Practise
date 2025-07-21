//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class MaxNum {
//    public static int findMax(int[] arr) {
//        int max = arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of Array");
//        int N = sc.nextInt();
//
//        System.out.println("Enter array");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] numArr = nums.split(" ");
//        int[] arr = new int[N];
//
//        for(int i=0;i<N;i++){
//            arr[i] = Integer.parseInt(numArr[i]);
//        }
//        System.out.println("Maximum : " + findMax(arr));
//    }
//}
