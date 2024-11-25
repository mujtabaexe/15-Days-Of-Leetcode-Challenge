class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0 ; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(s.length()-1-i);
            if(ch1!=ch2){
                return false;
            }
        }
        return true;
    }
}