
public class Mommyfier {
    public static final String MOMMY = "mommy";
    private static final String EMPTY_STRING = "";

    public String mommyfy(String text) {
        if(text.isEmpty())
            return text;

        if(isOneLetterWord(text)){
            return mommyfyLetter(text);
        } else {
            return mommyfySequence(firstLetter(text), secondLetter(text)) +
                    mommyfy(text.substring(1));
        }
    }

    private boolean isVowel(char character) {
        return "aeiouAEIOU".indexOf(character) >= 0;
    }

    private String mommyfySequence(char firstLetter, char secondLetter) {
        if(!isVowel(firstLetter)) {
            return String.valueOf(firstLetter);
        } else {
            if(isVowel(secondLetter)) {
                return EMPTY_STRING;
            } else {
                return MOMMY;
            }
        }
    }

    private char secondLetter(String text) {
        return text.charAt(1);
    }

    private String mommyfyLetter(String text) {
        if(isVowel(firstLetter(text))){
            return MOMMY;
        } else {
            return text;
        }
    }

    private boolean isOneLetterWord(String text) {
        return text.length() == 1;
    }

    private char firstLetter(String text) {
        return text.charAt(0);
    }
}
