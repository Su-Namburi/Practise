import java.io.*;
import java.util.*;

public class SumOfPairs {
    public static void mergeSort(long[] arr) {
        int len = arr.length;
        if(len <= 1) {
            return;
        }
        int i=0;int j=0;
        int mid = len/2;

        long[] left = new long[mid];
        long[] right = new long[len - mid];

        for(;i<len;i++) {
            if(i < mid) {
                left[i] = arr[i];
            }
            else {
                right[j] = arr[i];
                j++;
            }
        }
        mergeSort(left); mergeSort(right);
        merge(left,right,arr);
    }
    public static void merge(long[] left,long[] right,long[] arr) {
        int leftLen = arr.length/2;
        int rightLen = arr.length - leftLen;

        int i=0; int l=0; int r=0;
        while(l < leftLen && r < rightLen) {
            if(left[l] < right[r]) {
                arr[i] = left[l];
                i++;
                l++;
            }
            else {
                arr[i] = right[r];
                i++;
                r++;
            }
        }
        while(l < leftLen) {
            arr[i] = left[l];
            i++;
            l++;
        }
        while(r < rightLen) {
            arr[i] = right[r];
            i++;
            r++;
        }
    }
    public static boolean findPairs(long[] arr,long K) {
        int p1=0;int p2=arr.length-1;
        while(p1 < p2) {
            if(arr[p1] + arr[p2] == K) {
                return true;
            }
            if(arr[p1] + arr[p2] > K) {
                p2--;
            }
            else {
                p1++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] arr = new long[N];

            for(int i=0;i<N;i++) {
                arr[i] = sc.nextLong();
            }
            mergeSort(arr);
            boolean ans = findPairs(arr,K);
            System.out.println(ans);
        }



    }
}