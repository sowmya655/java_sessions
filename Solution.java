import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String stringOne = words[i];
            for (int j = 0; j < words.length; j++) {
                String stringTwo = words[j];
                if (i != j && checkIfSubstring(stringOne, stringTwo)) {
                    list.add(stringOne);
                    break; // Avoid duplicates
                }
            }
        }
        return list;
    }

    public boolean checkIfSubstring(String sOne, String sTwo) {
        for (int i = 0; i <= sTwo.length() - sOne.length(); i++) {
            if (sOne.equals(sTwo.substring(i, i + sOne.length()))) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"mass", "as", "hero", "superhero"};
        System.out.println(sol.stringMatching(words)); // Output: ["as", "hero"]
    }
}
