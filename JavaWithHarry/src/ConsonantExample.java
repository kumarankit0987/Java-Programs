import com.sun.source.tree.CaseTree;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ConsonantExample {
    public static void main(String[] args) {
        String str = "AnkitKumar";
        str = str.toLowerCase();
        Set<Character> characterSet=new HashSet<>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                vCount = vCount + 1;
//            }
            if(characterSet.contains(str.charAt(i))){
                vCount+=1;
            }
        }
        System.out.println(vCount);
        System.out.println(str.length() - vCount);
    }
}
