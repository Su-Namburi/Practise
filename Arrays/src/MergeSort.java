public class MergeSort {
    public static void printArr(int[] arr) {
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array
        //for populating the left and right arrays
        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;

        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;

        }
    }

    public static void main(String[] args)
    {
        // merge sort = recursively divide array in 2, sort, re-combine
        // run-time complexity = O(n Log n)
        // space complexity    = O(n)

        int[] array = {5,1,3,15,10,4};

        mergeSort(array);
        //printArr(array);

//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i]+ " ");
//        }
    }
}
