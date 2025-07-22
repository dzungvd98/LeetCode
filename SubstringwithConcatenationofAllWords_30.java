import java.util.List;
import java.util.ArrayList;

public class SubstringwithConcatenationofAllWords_30 {
    
    public static int findLengthOfSubstring(String[] words){
        int result = 0;
        for(String word : words) {
            result += word.length();
        }
        
        return result;
    }
    

    public static List<Integer> findSubstring(String s, String[] words) {
        System.out.println(findLengthOfSubstring(words));
        int  i = 0;
        while( i  < s.length()) {
            for(String word: words) {
                System.out.println(s.indexOf(word, 0));
            }
            i++;
        }
        return new ArrayList<>();
    }
    
    
    public static void main(String args[]) {
        String words[] = {"bar","foo","the"};
        String s = "barfoofoobarthefoobarman";
        
        findSubstring(s, words);
        
    }
}
