import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MommyfierTest {
    @Test
    public void shouldReturnEmptyString() {
        Mommyfier mommyfier = new Mommyfier();
        String emptyString = "";
        assertThat(mommyfier.mommyfyWord(emptyString), is(emptyString));
    }

    @Test
    public void shouldReturnMommyWhenOneVocalFound() {
        Mommyfier mommyfier = new Mommyfier();

        String vowel = "a";
        assertThat(mommyfier.mommyfyWord(vowel), is("mommy"));
    }

    @Test
    public void shouldReturnMommyWhenMoreThanOneVocalFound() {
        Mommyfier mommyfier = new Mommyfier();

        String wordWithMultipleVowels = "aeiouAEIOU";
        assertThat(mommyfier.mommyfyWord(wordWithMultipleVowels), is("mommy"));
    }

    @Test
    public void shouldReturnMommyWhenOneVowelAndDifferentLetters() {
        Mommyfier mommyfier = new Mommyfier();

        String word = "add";
        assertThat(mommyfier.mommyfyWord(word), is ("mommydd"));
    }

    @Test
    public void shouldNotReturnMommyIfNoVowelsFound(){
        Mommyfier mommyfier = new Mommyfier();

        String word = "qwtymn";
        assertThat(mommyfier.mommyfyWord(word), is ("qwtymn"));
    }

    @Test
    public void shouldReturnMommyIfVowelLastLetter(){
        Mommyfier mommyfier = new Mommyfier();

        String word = "qwtymnA";
        assertThat(mommyfier.mommyfyWord(word), is ("qwtymnmommy"));
    }
}
