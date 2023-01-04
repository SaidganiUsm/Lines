package practice.regex;

public class SplitText {
    public static void main(String[] args) {
        System.out.println(splitTextIntoWords(""));
    }
    public static String splitTextIntoWords(String text) {
        String regax = ("\\p{Punct}|\\.|[0-9]");
        String clearText = text.replaceAll(regax, " ");
        String[] word = clearText.split("\\s+");
        String result = word[0];
        for(int i = 1; i < word.length; i++){
            if(word[i] =="\n")
                return word[i];
            result += "\n" + word[i];
        }
        return result;
    }
}