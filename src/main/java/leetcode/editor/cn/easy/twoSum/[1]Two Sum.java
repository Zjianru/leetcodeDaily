package leetcode.editor.cn.easy.twoSum;//Given an array of integers nums and an integer target, return indices of the
//two numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may 
//not use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// Only one valid answer exists. 
// 
//
// 
//Follow-up: Can you come up with an algorithm that is less than 
//O(n²)
// time complexity?
//
// Related Topics 数组 哈希表 👍 18460 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if ((nums.length == 0) || (nums.length == 1 && nums[0] == target)) {
            return nums;
        }
        // 暴力
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
        // 散列
        Map<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = nums[i];
            if (table.containsKey(target - index)) {
                return new int[]{table.get(target - index), i};
            } else {
                table.put(index, i);
            }
        }
        return new int[]{};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
