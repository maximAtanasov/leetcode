import java.util.Arrays;

public class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] arr = new int[totalLength];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        if (totalLength % 2 == 0) {
            return (double) (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        }
        return arr[totalLength / 2];
    }
}
