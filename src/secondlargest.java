import java.util.*;

public class secondlargest {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // because 1-based index
            } else if (sum < target) {
                left++;  // move right to increase sum
            } else {
                right--; // move left to decrease sum
            }
        }

        return new int[]{-1, -1}; // not found
    }
}

