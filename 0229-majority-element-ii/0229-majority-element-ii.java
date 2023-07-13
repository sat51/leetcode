class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> l1 = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > nums.length/3){
                l1.add(entry.getKey());
            }
           
        }
        
         return l1;
    }
}