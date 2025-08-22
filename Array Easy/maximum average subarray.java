class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n = nums.length;
    double maxAvg = Double.NEGATIVE_INFINITY;
    for (int i = 0; i <= n - k; i++) {
    int sum = 0;
    for (int j = i; j < i + k; j++) {
        sum += nums[j];
    }
    double avg = (double) sum / k;
    maxAvg = Math.max(maxAvg, avg);
    }
    return maxAvg;
    }
}