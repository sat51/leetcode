class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
        int last_smaller = Integer.MIN_VALUE;
        int curcount = 0;
        int longest =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == last_smaller){
                curcount+=1;
                last_smaller = nums[i];
            }
            else if(nums[i]!= last_smaller){
                curcount =1;
                last_smaller = nums[i];
            }
            longest = Math.max(longest,curcount);
        }
        return longest;
    }
}