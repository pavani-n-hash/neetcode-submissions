class Solution {
    public boolean hasDuplicate(int[] nums){
HashSet <Integer> hash = new HashSet<>();
for(int i=0;i<nums.length;i++){
    if(hash.add(nums[i])==false){
        return true;
    }
}
return false;
}
}