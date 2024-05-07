package binarysearch;

public class PeakElement {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        //add code here.
        int l = 0;
        int r = n - 1;
        //Take an example of 3 elements {1 2 3}, if 2(arr[mid]) not the answer, then l = mid+1,
        //so we have to check 3 also, therefore equality in l<=r
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int prev = (mid == 0) ? Integer.MIN_VALUE : arr[mid - 1];
            int next = (mid == n - 1) ? Integer.MIN_VALUE : arr[mid + 1];
            if (prev <= arr[mid] && arr[mid] >= next) {
                return mid;
            } else if (arr[mid] <= arr[mid + 1]) {
                l = mid + 1;
            } else if (arr[mid - 1] >= arr[mid]) {
                r = mid - 1;
            }
        }
        return -1;
    }
}
