class Solution {
    public int[] twoSum(int[] nums, int target) {
            int[] arr = new int[2];
        for(int i =0;i<nums.length;i++){
            int m = target - nums[i];
            
            for(int j =i+1;j<nums.length;j++){
                if(nums[j] == m){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
        // int[] result = new int[2];
        // HashMap<Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!map.containsKey(target-nums[i])){
        //     map.put(nums[i],i);
        //  }
        //  else{
        //     result[1] = i;
        //     result[0] = map.get(target-nums[i]);
        //     return result;
        //     }
        // }
    }
}


