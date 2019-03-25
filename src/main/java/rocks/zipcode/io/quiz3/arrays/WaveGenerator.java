package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.capitalizeNthCharacter;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
    /*    String[] resultArr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() -1 && !Character.isLetter(str.charAt(i))) {
                i++;
            }
            if (Character.isLetter(str.charAt(i))) {
                String loweredString = str.toLowerCase();
                resultArr[i] = capitalizeNthCharacter(loweredString, i);
            }
        }
        return resultArr;
    }*/
        
        str = str.toLowerCase();
        String[] strings = new String[0];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter((str.charAt(i)))) {
                String cappedString = StringUtils.capitalizeNthCharacter(str, i);
                list.add(cappedString);
            }
/*            String[] newArray = new String[list.size()];
            list.toArray(newArray);*/
            strings = list.stream().toArray(String[]::new);
        } return strings;
    }
}