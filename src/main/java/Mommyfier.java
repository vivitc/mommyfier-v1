
public class Mommyfier {
    public static final String MOMMY = "mommy";
    private static final String EMPTY_STRING = "";

    public String mommyfyWord(String word) {
        String mommyfiedWord = "";
        boolean shouldAddMommy = false;
        for(char character : word.toCharArray()) {
            if(!isVowel(character)){
                mommyfiedWord += (getMommy(shouldAddMommy) + String.valueOf(character));
                shouldAddMommy = false;
            } else {
                shouldAddMommy = true;
            }
        }
        mommyfiedWord += getMommy(shouldAddMommy);
        return mommyfiedWord;
    }

    private String getMommy(boolean shouldAddMommy){
        if(shouldAddMommy){
            return MOMMY;
        } else {
            return EMPTY_STRING;
        }
    }

    private boolean isVowel(char character) {
        return "aeiouAEIOU".indexOf(character) >= 0;
    }
}
