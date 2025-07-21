public class Test {
    public static void foo(int[] arr) {
        int sum = 0;int prod = 1;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
            prod = prod * arr[i];
        }
        System.out.println(sum + " " + prod);
    }
    public static void printPairs(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                System.out.print(arr[i] + "," + arr[j] + " ");
            }
            System.out.println();
        }
    }
    public static void printUnorderedPairs(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                System.out.print(arr[i] + "," + arr[j] + " ");
            }
            System.out.println();
        }
    }
    public static void printStars(int[] arr) {
        for(int i= arr.length;i>=0;i--) {
            for (int j=i+1;j<arr.length;j++) {
                //System.out.print(arr[i] + "," + arr[j] + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void printStarsMirror(int[] arr) {
        for(int i= arr.length;i>=0;i--) {
            for(int s = 0;s<i;s++) {
                System.out.print("  ");
            }
            for (int j=i+1;j<arr.length;j++) {
                //System.out.print(arr[i] + "," + arr[j] + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void printStarTree(int[] arr) {
        for(int i= arr.length;i>=0;i--) {
            for(int s = 0;s<i;s++) {
                System.out.print(" ");
            }
            for (int j=i+1;j<arr.length;j++) {
                //System.out.print(arr[i] + "," + arr[j] + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,5};
        //foo(arr);
        //printPairs(arr);
        //printUnorderedPairs(arr);
        printStars(arr);
        printStarsMirror(arr);
        printStarTree(arr);
    }
}
