class Solution {
    public int addDigits(int num) {
        int temp,sum = 0;
        while(num > 9){
            sum = 0;
            while(num >0){
                temp = num % 10;
                sum =  sum + temp;
                num = num / 10;
            }
            num = sum;

        }
        return num;
    }
}