class Solution {
    public int[] sortArray(int[] nums) {        
        quickSort(nums, 0, nums.length-1);

        return nums;
    }

    void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int[] pivots = partition(array, low, high);
            quickSort(array, low, pivots[0] - 1);
            quickSort(array, pivots[1] + 1, high);
        }
    }

    int[] partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1, j = low, k = high;
        
        while (j <= k) {
            if (array[j] < pivot) {
                swap(array, ++i, j++);
            } else if (array[j] > pivot) {
                swap(array, j, k--);
            } else {
                j++;
            }
        }
        return new int[]{i + 1, k};
    }

    void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}