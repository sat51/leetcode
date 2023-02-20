class Solution {
    public int searchInsert(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        int low =0;
        int high=nums.length-1;
        int res =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]<=target){
                low = mid+1;
                res = low;
            }
            else{
                high = mid-1;
            }
            
        }
        return res;

        
    }
}