package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.hasVowels;
import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.isVowel;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String output = "";
        StringBuilder sb = new StringBuilder();
        List<String> words = Arrays.asList(str.split(" "));
        for (String word : words) {
            sb.append(translateWord(word)).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    
    public static String translateWord(String str) {
        String output = "";
        int pos = -1;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (isVowel(ch)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            output = str + "ay";
        } else if (pos == 0) {
            output = str + "way";
        } else {
            output = str.substring(pos) + str.substring(0, pos) + "ay";
        }
        return output;
    }
}
    
    
    /*public String translator(String str) {
        String output = "";
        int pos = -1;
        List<String> words = Arrays.asList(str.split(" "));
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                Character ch = word.charAt(i);
                if (isVowel(ch)) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) {
                output = word + "ay";
            } else if (pos == 0) {
                output = word + "way";
            } else {
                output = word.substring(pos) + word.substring(0, pos) + "ay";
            }
        }
        return output;
    }
}*/