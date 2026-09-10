class Solution {
    public int xorOperation(int n, int start) {
        int a;
        int c = 0;
        for(int i = 0;i<n;i++){
            a = start + 2 * i;
            c = c ^ a;
        }
        return c;
    }
}