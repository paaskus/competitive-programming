import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int argsNum = sc.nextInt(); if (argsNum < 1) return;
        int[] nums = new int[argsNum];

        // initialize array
        for (int i = 0; i < argsNum; i++) {
            nums[i] = sc.nextInt();
        }

        // output input
        printArray("input: ", nums);

        // merge sort input
        printArray("output: ", mergeSort(nums));
    }

    public static int[] mergeSort(int[] nums) {
        if (nums.length == 1) return nums; // base case
        int mid = nums.length / 2;
        return merge(mergeSort(Arrays.copyOfRange(nums, 0, mid)),
                     mergeSort(Arrays.copyOfRange(nums, mid, nums.length)));
    }

    public static int[] merge(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] result = new int[length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < length; i++) {
            if (aIndex >= a.length) {
                result[i] = b[bIndex]; bIndex++; continue;
            }
            if (bIndex >= b.length) {
                result[i] = a[aIndex]; aIndex++; continue;
            }
            if (a[aIndex] < b[bIndex]) {
                result[i] = a[aIndex];
                aIndex++;
            } else {
                result[i] = b[bIndex];
                bIndex++;
            }
        }
        return result;
    }

    private static void printArray(String prefix, int[] array) {
        System.out.print(prefix+"[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            // not last element
            if ((i+1) != array.length) System.out.print(", ");
        }
        System.out.print("]\n");
    }
    
}
