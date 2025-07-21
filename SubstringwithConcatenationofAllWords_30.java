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
        return new ArrayList<Integer>();
    }
    
    
    public static void main(String args[]) {
        String words[] = {"word","good","best","words"};
        
        findSubstring("aaaa", words);
        
    }
}
