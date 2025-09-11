import java.util.*;

class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        for (char ch : arr) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = vowels.get(idx++);
            }
        }
        return new String(arr);
    }
}
