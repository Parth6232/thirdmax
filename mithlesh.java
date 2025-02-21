public class mithlesh{
    public static void main(String[] args) {
        int arr[]={7,3,5,3,5,9,5,67,5,44};
        int max3rd = secondlargest(arr);
        System.out.println("the third largest element in an array is :" + max3rd);
    }

    static int maximum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondlargest(int arr[]) {
        int max = maximum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax= maximum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == secondMax) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int thirdmax=maximum(arr);
        return thirdmax;
    }
}