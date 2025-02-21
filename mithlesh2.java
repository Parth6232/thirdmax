import java.util.Scanner;

public class mithlesh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an aray ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = thirdmaximum(arr);
        System.out.println(mid);
    }

    static int thirdmaximum(int arr[]) {
        if (arr.length < 3) {
            return -1;
        }
        Integer max = null, min = null, mid = null;
        for (int i = 0; i < arr.length; i++) {
            if ((min != null && arr[i] == min)
                    || (max != null && arr[i] == max)
                    || (mid != null && arr[i] == mid)) {
                continue;
            }

            if (min == null || arr[i] < min) {
                max = mid;
                mid = min;
                min = arr[i];
            } else if (max == null || arr[i] > max) {
                mid = max;
                max = arr[i];
            } else if (mid == null || (arr[i] > min && arr[i] < max)) {
                mid = arr[i];
            }
        }
        return (mid == null) ? -1 : mid;
    }
}
