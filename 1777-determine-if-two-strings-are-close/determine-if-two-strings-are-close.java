class Solution {
    public boolean closeStrings(String word1, String word2) {
         if(word1.length()!=word2.length())
         {
            return false;
         }
         int []freq1=new int[256];     
         int []freq2=new int[256]; 
         boolean []chars1=new boolean[256];  
         boolean []chars2=new boolean[256];  

         for(char c : word1.toCharArray())
         {
            freq1[c- 'a']++;
            chars1[c- 'a']=true;
         }


         for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            chars2[c - 'a'] = true;
        }
   
        for (int i = 0; i < 26; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        return Arrays.equals(freq1, freq2);
    }
}
   