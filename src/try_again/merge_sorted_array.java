package try_again;

/**
 * Created by Administrator on 2016/1/5.
 */
public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        int t;

        for (int i = 0; i < m + n; i++) {
            for (int j = 0; j < m + n - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    t = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = t;
                }
            }
        }
    }

    public static void merge_2(int A[], int m, int B[], int n) {
        // 想到利用性质，但int[]没法插入，
        // 那么倒着往回比大小，谁大谁排最后，这样前面就腾出地方了，
        // 最后再把剩下的（如果有的话）nums2里的数放到nums1里，这时剩下的nums2肯定是最小的了
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i > -1 && j > -1)
            A[k--] = (A[i] > B[j]) ? A[i--] : B[j--];
        while (j > -1)
            A[k--] = B[j--];
    }

    public static void main(String[] args) {
        int[] A = {8, 9, 10, 0, 0, 0};
        int[] B = {1, 2, 3};

        merge_2(A, 3, B, 3);
    }
}
