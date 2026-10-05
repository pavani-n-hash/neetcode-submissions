class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> var = new HashSet<>();
for(int num : nums){
if(var.contains(num)){
            return true;
        }else{
            var.add(num);
        }
            }
        return false;
    }
}