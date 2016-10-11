
public class Mommyfier {
    public static final String MOMMY = "mommy";
    public String mommyfy(String word) {
        if(!word.isEmpty()) {
            boolean isVowel = isVowel(firstLetterInLowerCaseFrom(word));
            if (isVowel) {
                return MOMMY;
            }
        }
        return word;
    }

    private char firstLetterInLowerCaseFrom(String word) {
        return word.toLowerCase().charAt(0);
    }

    private boolean isVowel(char character) {
        return character == 'a';
    }
}
