import java.util.Scanner;

public class BitonicSequence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int n=0;n<N;n++) {
            arr[n] = sc.nextInt();
        }
        String type = "";
        if(arr[0] > arr[1])
        {
            type = "trough";
        }
        else {
            type = "peak";
        }
        boolean isBitonic = false;
        switch (type) {
            case "peak" :
                int p = 1;
                while(p < N-1) {
                    if(arr[p-1] < arr[p] && arr[p+1] < arr[p]) {
                        isBitonic = true;
                        break;
                    }
                    else {
                        p++;
                    }
                }
            case "trough" :
                int r=1;
                while(r < N-1) {
                    if(arr[r-1] > arr[r] && arr[r+1] > arr[r]) {
                        isBitonic = true;
                        break;
                    }
                    else {
                        r++;
                    }
                }
        }
        System.out.println(isBitonic ? "true" : "false");
    }
}
