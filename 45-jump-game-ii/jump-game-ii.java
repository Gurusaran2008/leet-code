class Solution {
    public int jump(int[] nums) {
        int a =0; 
        int f = 0;
        int c = 0;
        for(int i  = 0;i<nums.length-1;i++){
            if(i+nums[i] > f){
                f = i + nums[i];
            }
            if(i == c){
                a++;
                c = f;
            }
        }
        return a;
    }
}