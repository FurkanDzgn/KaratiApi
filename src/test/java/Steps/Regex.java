package Steps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Regex {

    public static void main(String[] args) {

        String lowerLetter = "l";
        String upperCaseLetter = "L";
        String specialCaharacter = ",";
        String number = "8";

        String anyCharacterRegex = ".";

//        System.out.println(lowerLetter.matches(anyCharacterRegex));
//        System.out.println(upperCaseLetter.matches(anyCharacterRegex));
//        System.out.println(specialCaharacter.matches(anyCharacterRegex));
//        System.out.println(number.matches(anyCharacterRegex));

        String word = "techtorial";
        String regexAnyCharacterAnyTime = ".*ia.*";
        System.out.println(word.matches(regexAnyCharacterAnyTime));

        String regexAnyCharacterAnyTime02 = ".*t.*t.*";
        System.out.println(word.matches(regexAnyCharacterAnyTime02));

        String regexAnyCharacterAnyTime03 = ".*ial";
        System.out.println(word.matches(regexAnyCharacterAnyTime03));

        String regexAnyCharacterAnyTime04 = ".*a.*r.*";
        System.out.println(word.matches(regexAnyCharacterAnyTime04));

        String onlyLetters = "[a-zA-Z]*";
        System.out.println(word.matches(onlyLetters));

        String word02 = "535653ddd9";
        String onlyLetters02 = "[0-9]*";
        System.out.println(word02.matches(onlyLetters02));

        String phoneNumber = "332-225-2495";
        String regexForPhoneNumber = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
        System.out.println(phoneNumber.matches(regexForPhoneNumber));

        String phoneNumber02 = "332-225-2495";
        String regexForPhoneNumber02 = "\\d{3}-[0-9]{3}-[0-9]{4}";
        System.out.println(phoneNumber02.matches(regexForPhoneNumber02));

        String str = "hjsfdy.sf/sfuh";
        String regexForDoesntContain = "[^0-9]*";
        System.out.println(str.matches(regexForDoesntContain));

        String str02 = "fcfsdvghv,jfu.465367/er7";
        String[] arr = str02.split("[,.]");
        System.out.println(Arrays.toString(arr));

        String str03 = "fcfsdvghv,jfu.465367/er7";
        String[] arr02 = str03.split("[\\D]");
        System.out.println(Arrays.toString(arr02));

        String str04 = "Techtorial";
        // string T=2,c=1,.....

        Map<Character, Integer> count = new HashMap<>();

        str04.toUpperCase().chars().mapToObj(ch->(char)ch).forEach(ch->count.put(ch,count.containsKey(ch) ? (count.get(ch)+1 : 1));

        String str05 = count.toString().replace("=",".").replaceAll("[{},]","");

        System.out.println(str05);

    }
}
