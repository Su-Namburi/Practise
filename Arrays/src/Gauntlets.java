public class Gauntlets {
    public static int findMax(int[] arr) {
        int len = arr.length;
        int max = arr[0];
        for(int i=1;i<len;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findPairs(int[] arr) {
        int max = findMax(arr);
        int count = 0;
        int[] countArr = new int[max + 1];
        for(int i=0;i< countArr.length;i++) {
            countArr[i] = 0;
        }
        for(int j=0;j<arr.length;j++) {
            countArr[arr[j]]++;
        }
        for(int i=0;i<=max;i++) {
            count = count + countArr[i]/2;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,7,4,1,4};
        System.out.println(findPairs(arr));
    }
}
