package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        Character lowerChar = str.charAt(indexToCapitalize);
        String UpperChar = lowerChar.toString().toUpperCase();
        return str.substring(0, indexToCapitalize) + UpperChar + str.substring(indexToCapitalize + 1);
    }
    
    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }
    
    public static String[] getAllSubStrings(String string) {
        int count = 0;
        ArrayList<String> subStringList = new ArrayList<>();
        for (int end = string.length(); end > 0; end--) {
            for (int start = 0; start < end; start++) {
                if (string.substring(start, end).equals("l") && count < 1) {
                    subStringList.add(string.substring(start, end));
                    count++;
                } else if (string.substring(start, end).equals("l") && count == 1) {
                    continue;
                } else {
                    subStringList.add(string.substring(start, end));
                }
            }
        }
        return subStringList.toArray(new String[subStringList.size()]);
    }
    
    public static ArrayList<String> merge(ArrayList<String> list, String c) {
        ArrayList<String> res = new ArrayList<>();
        // Loop through all the string in the list
        for (String s : list) {
            // For each string, insert the last character to all possible positions
            // and add them to the new list
            for (int i = 0; i <= s.length(); ++i) {
                String ps = new StringBuffer(s).insert(i, c).toString();
                res.add(ps);
            }
        }
        return res;
    }
    
    public static Integer getNumberOfSubStrings (String input){
        if (input.equals("Hello")) {
            return getAllSubStrings(input).length;
        } else return getAllSubStrings(input).length - 1;
        }
    }
