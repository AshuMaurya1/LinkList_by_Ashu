import java.util.Arrays;

public class LeetCodeProblem34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1}; 
        if (nums.length == 0) return ans;
        
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }
    private static int findFirst(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }  
    private static int findLast(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
                high = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 6, 8};
        int target = 3;

        System.out.println("Original Array : " + Arrays.toString(arr));
        int[] result = searchRange(arr, target);
        System.out.println("Position of the item : " + Arrays.toString(result));
    }
}