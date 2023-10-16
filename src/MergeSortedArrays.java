public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Ponteiro para nums1
        int p2 = n - 1; // Ponteiro para nums2
        int p3 = m + n - 1; // Ponteiro para o final do array resultante

        // Mescla nums1 e nums2, do final para o início
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }

        // Se houver elementos restantes em nums2, copia-os para nums1
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // Tamanho de nums1 é m + n
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Imprime o array mesclado
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
