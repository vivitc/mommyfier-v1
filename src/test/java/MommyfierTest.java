import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MommyfierTest {
    @Test
    public void shouldReturnEmptyString() {
        Mommyfier mommyfier = new Mommyfier();
        String emptyString = "";
        assertThat(mommyfier.mommyfy(emptyString), is(emptyString));
    }

    @Test
    public void shouldReturnMommyWhenOneVocalFound() {
        Mommyfier mommyfier = new Mommyfier();

        String vowel = "a";
        assertThat(mommyfier.mommyfy(vowel), is("mommy"));
    }

    @Test
    public void shouldReturnNotMommyWhenNoVocalFound() {
        Mommyfier mommyfier = new Mommyfier();

        String vowel = "d";
        assertThat(mommyfier.mommyfy(vowel), is("d"));
    }

    @Test
    public void shouldReturnMommyWhenMoreThanOneVocalFound() {
        Mommyfier mommyfier = new Mommyfier();

        String wordWithMultipleVowels = "aeiouAEIOU";
        assertThat(mommyfier.mommyfy(wordWithMultipleVowels), is("mommy"));
    }

    @Test
    public void shouldReturnMommyWhenOneVowelAndDifferentLetters() {
        Mommyfier mommyfier = new Mommyfier();

        String word = "add";
        assertThat(mommyfier.mommyfy(word), is ("mommydd"));
    }

    @Test
    public void shouldReturnMommyWhenOneVowelAndDifferentLetterFollowedByVowles() {
        Mommyfier mommyfier = new Mommyfier();

        String word = "addaA";
        assertThat(mommyfier.mommyfy(word), is ("mommyddmommy"));
    }

    @Test
    public void shouldNotReturnMommyIfNoVowelsFound(){
        Mommyfier mommyfier = new Mommyfier();

        String word = "qwtymn";
        assertThat(mommyfier.mommyfy(word), is ("qwtymn"));
    }

    @Test
    public void shouldReturnMommyIfVowelLastLetter(){
        Mommyfier mommyfier = new Mommyfier();

        String word = "qwtymnAeeeeeee";
        assertThat(mommyfier.mommyfy(word), is ("qwtymnmommy"));
    }
}
