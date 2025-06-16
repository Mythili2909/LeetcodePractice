class Solution {
    public int maxVowels(String s, int k) {
        // Set of vowels for quick lookup
        String vowels = "aeiou";
        
        int maxVowels = 0;
        int currentVowels = 0;

        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
        }

        maxVowels = currentVowels;

        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            // Remove the effect of the character that is sliding out of the window
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentVowels--;
            }
            // Add the effect of the new character entering the window
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
            // Update the maximum number of vowels found
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }
}
