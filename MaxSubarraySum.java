public class MaxSubarraySum {
    public int f(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0;i<n;i++) {
            curr += nums[i];
            res = (res < curr) ? curr : res;
            if(curr < 0)
                curr = 0;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,-1,2,-2,3,-4,5,9};
        System.out.println(f(arr)); // 14
    }
}
