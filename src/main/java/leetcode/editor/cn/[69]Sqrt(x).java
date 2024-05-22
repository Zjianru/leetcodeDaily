//Given a non-negative integer x, return the square root of x rounded down to 
//the nearest integer. The returned integer should be non-negative as well. 
//
// You must not use any built-in exponent function or operator. 
//
// 
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. 
// 
//
// 
// Example 1: 
//
// 
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
// 
//
// Example 2: 
//
// 
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down 
//to the nearest integer, 2 is returned.
// 
//
// 
// Constraints: 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
//


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
