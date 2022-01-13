package SimplePrograms;

public class ReverseString {
    public static void main(String[] args) {
        String suppliedString="Java Concept Of The Day";
      //  reverseByBuiltInMethod(suppliedString);
     // reverseByIterativeMethod(suppliedString);
      //  reverseByIterativeMethodTwo(suppliedString);
      //  System.out.println(reverseStringByRecursiveMethod(suppliedString));
        reverseEachOfTheWordsOfString(suppliedString);
    }

    public static void reverseByBuiltInMethod(String inputString){
        StringBuffer sbf=new StringBuffer(inputString);
      //  System.out.println(sbf.reverse());
        StringBuffer std=sbf.reverse();
        System.out.println(sbf);
    }

    public static void reverseByIterativeMethod(String inputString){
        char []chArray=inputString.toCharArray();
        String reverseString="";
        for (int i=chArray.length-1;i>=0;i--){
            reverseString=reverseString+chArray[i];
        }
        System.out.println("Reverse String is: "+reverseString);
    }

    public static void reverseByIterativeMethodTwo(String inputString){

        String reverseString="";
        for (int i=inputString.length()-1;i>=0;i--){
            reverseString=reverseString+inputString.charAt(i);
        }
        System.out.println("Reverse String is: "+reverseString);
    }

    public static String reverseStringByRecursiveMethod(String inputString){
        if(inputString==null||inputString.length()<=1){
            return inputString;
        }
        return reverseStringByRecursiveMethod(inputString.substring(1))+inputString.charAt(0);
    }

    public static void reverseEachOfTheWordsOfString(String givenString){
        String reverseString="";
        String[]arrayOfWords=givenString.split(" ");
        for(int i=0;i<arrayOfWords.length;i++){
            String individualWord=arrayOfWords[i];
            String rev="";
            for(int j=individualWord.length()-1;j>=0;j--){
                rev=rev+individualWord.charAt(j);
            }
            System.out.println("Reverse Word: "+rev);
            reverseString=reverseString+rev+" ";
        }
        System.out.println("Supplied String: "+givenString);
        System.out.println("Reverse String: " +reverseString);
    }

    public static void reverseStringKeepingSpacePositionSame(String givenString){
        String build="run for jenkins build";
    }

}
