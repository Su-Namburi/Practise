// insertion sort
// after comparing elements to the left
//if less, shift the elements to the right to make room to insert a value
//O(n^2) small data - decent , large array - bad
//less steps that bubble and selection sort

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int temp = arr[i];
            int j = i-1;          //to keep track of the left side values
            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];  //to shift the value to the right
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,1,8,2,7,3,6,5,4};
        insertionSort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
