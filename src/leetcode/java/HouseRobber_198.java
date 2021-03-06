package leetcode.java;

public class HouseRobber_198 {
  public int rob(int[] nums) {
    if (nums.length < 1) return 0;
    if (nums.length == 1) return nums[0];
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      dp[i] = Math.max(nums[i - 2] + dp[i], dp[i - 1]);
    }
    return dp[nums.length - 1];
  }
}
