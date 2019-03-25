package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return word.matches("[^aeiouAEIOU]*[aeiouAEIOU].*$");
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer answer = -1;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c)) {
                answer = word.indexOf(c);
                break;
            } else {
                answer = -1;
            }
        } return answer;
    }

    public static Boolean startsWithVowel(String word) {
        return word.matches("(^[AEIOUaeiou].*$)");
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(character.toString());
    }
}
