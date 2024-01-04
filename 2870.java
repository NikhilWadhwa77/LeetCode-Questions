class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(mp.get(nums[i]) == null){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i]) + 1);
            }
        }

        int op = 0;
        for(int key : mp.keySet()){
            int tempCount = mp.get(key);
            while(tempCount > 5){
                tempCount -= 3;
                op++;
            }
            if(tempCount == 5 || tempCount == 4){
                op += 2;
            }else if(tempCount == 3 || tempCount == 2){
                op++;
            }else if(tempCount == 1){
                return -1;
            }

        }
        return op;
    }
}
