class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;
        while(x>0){
            int a = x % 10;
            sum = sum*10 + a;
            x = x/10;
        }
        if(temp == sum){
            return true;
        }
        else{
            return false;
        }
    }
}