class Solution {
    public boolean isAnagram(String s, String t) {

        // 1. Quick check: if lengths differ, they can't be anagrams
      
        if (s.length() != t.length()) {
            return false;
        }
       
        int [] count = new int[26];
        
        // 2. TODO: Write a loop from i = 0 to s.length()
        for (int i = 0; i < s.length(); i++) {

            // Inside the loop:
        // - Increment the count for the character in s: count[s.charAt(i) - 'a']++
        // - Decrement the count for the character in t: count[t.charAt(i) - 'a']--
        
            count[s.charAt(i) - 'a'] ++;
            count[t.charAt(i) - 'a'] --;
        }
        
        // 3. TODO: Write a second loop or check to see if any value in 'count' != 0
        
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        } 
        return true;     
    }
}
