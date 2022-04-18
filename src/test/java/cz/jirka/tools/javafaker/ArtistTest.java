package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ArtistTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.artist().name(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){1,2}"));
    }
}
