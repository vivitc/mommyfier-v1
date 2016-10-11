import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MommyfierTest {
    @Test
    public void shouldReturnEmptyString() {
        Mommyfier mommyfier = new Mommyfier();
        String emptyString = "";
        assertThat(emptyString, is(mommyfier.mommyfy(emptyString)));
    }
}
