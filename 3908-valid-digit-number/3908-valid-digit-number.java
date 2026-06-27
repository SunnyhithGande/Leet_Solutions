class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        String q = String.valueOf(x);
        if(s.contains(q) && s.charAt(0) != q.charAt(0)) return true;
        return false;
    }
}