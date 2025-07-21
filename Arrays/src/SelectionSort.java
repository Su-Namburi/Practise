import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int N = arr.length;
        for(int i=0;i<N-1;i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++) {
                arr[i] = sc.nextInt();
            }
            selectionSort(arr);
            for(int k : arr) {
                System.out.println(k);
            }

        }
    }
}

