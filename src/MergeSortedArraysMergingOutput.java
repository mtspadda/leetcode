public class MergeSortedArraysMergingOutput {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m - 1;
            int p2 = n - 1;
            int p3 = m + n - 1;

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

                // Imprime o estado atual do array após cada etapa
                printArray(nums1);
            }

            // Copia os elementos restantes de nums2 para nums1, se houver
            while (p2 >= 0) {
                nums1[p3] = nums2[p2];
                p2--;
                p3--;

                // Imprime o estado atual do array após cada etapa
                printArray(nums1);
            }
        }

        // Função auxiliar para imprimir o estado atual do array
        public static void printArray(int[] nums) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = {2, 5, 6};
            int n = 3;

            // Imprime o estado inicial do array nums1
            System.out.println("Estado inicial do array nums1:");
            printArray(nums1);

            // Chama a função merge e imprime cada passo da ordenação
            merge(nums1, m, nums2, n);
        }
    }
