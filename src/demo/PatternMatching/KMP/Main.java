package demo.PatternMatching.KMP;

public class Main {


    public static void main(String[] args) {

        // Web page to search:
        String str = "Just have a good look please at this big ol string with a few repeat strings. I made this string myself.";
        // User seached for:
        String patternToMatch = "string";

        // Convert strings to char[] and call KMP search()
        KMP kmp = new KMP();
        int matchIndex = kmp.search(str.toCharArray(), patternToMatch.toCharArray());





    }



}
