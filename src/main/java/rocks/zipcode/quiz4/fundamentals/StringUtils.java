package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + str.substring(str.length()/2, str.length()/2 + 1).toUpperCase() + str.substring(str.length()/2 + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + str.substring(str.length()/2, str.length()/2 + 1).toLowerCase() + str.substring(str.length()/2 + 1);
    }

    public static Boolean isIsogram(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        String checkString = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            if (checkString.charAt(i) == checkString.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        int count = 0;
        char[] charsToRemove = str.toCharArray();
        char[] result = new char[str.length() - count];
        for (int i = 0; i < charsToRemove.length - 1; i++) {
            if (i != 0) {
                if (charsToRemove[i] == charsToRemove[i + 1] || charsToRemove[i] == charsToRemove[i - 1]) {
                    count++;
//                    if (count++ < 1){
//                        result[i] = charsToRemove[i];
//                    }
                }
            }
            else {
                result[i] = charsToRemove[i];
            }
        }
        System.out.println(count);
        return result.toString();
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}