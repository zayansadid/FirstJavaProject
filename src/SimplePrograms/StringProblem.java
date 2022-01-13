package SimplePrograms;

import java.util.HashMap;
import java.util.Set;

public class StringProblem {
    public static void main(String[] args) {
        String input="Butter is Better than cheese";
       // findCharacterOccurenceInString(input);
        findCharactersMoreThanOnce(input);
        String inputString="OneSpace TwoSpace  ThreeSpace   FourSpace    Tab    End";
        removeAllWhiteSpacesFromString(inputString);
        String inputString2="  Example Of Trimmed String   ";
        removeWhiteSpaceFromTwoEnds(inputString2);
    }

    public static void findCharacterOccurenceInString(String givenString){
        HashMap<Character,Integer>charCountMap=new HashMap<>();
        char[]strArray=givenString.toCharArray();

        for (Character ch:strArray){
            if (charCountMap.containsKey(ch)){
               charCountMap.put(ch, charCountMap.get(ch)+1) ;
            }else {
                charCountMap.put(ch, 1);
            }
        }
        Set<Character>allKeySet=charCountMap.keySet();
        for(Character c:allKeySet){
            System.out.println("Character: "+c+" = "+charCountMap.get(c));
        }
    }
    public static void findCharactersMoreThanOnce(String givenString){

        HashMap<Character,Integer>charCountMap=new HashMap<>();
        //if want to remove white space
        char[]chArray=givenString.replaceAll(" ", "").toCharArray();
        for (char ch:chArray){
            if(charCountMap.containsKey(ch)){
                charCountMap.put(ch, charCountMap.get(ch)+1);
            }else {
                charCountMap.put(ch, 1);
            }
        }
        Set<Character>allCharSet=charCountMap.keySet();
        for(Character cha:allCharSet){
            if (charCountMap.get(cha)>1){
                System.out.println("Character: "+cha+" = "+charCountMap.get(cha));
            }
        }
    }

    public static void removeAllWhiteSpacesFromString(String givenString){
        String removeWhiteSpaces=givenString.replaceAll("\\s+", "");
        System.out.println(removeWhiteSpaces);
    }

    public static void removeWhiteSpaceFromTwoEnds(String givenString){
        String trimmedString=givenString.trim();
        System.out.println(trimmedString);
    }
}
