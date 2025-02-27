package cz.jirka.tools.javafaker;

import static org.junit.Assert.assertThat;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class KaamelottTest extends AbstractFakerTest {

    @Test
    public void testCharacter() {
        assertThat(faker.kaamelott().character(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z' -ÇÉàçêèéïîüùú]+"));
    }

    @Test
    public void testQuote() {
        assertThat(faker.kaamelott().quote(), MatchesRegularExpression.matchesRegularExpression("[-A-Za-z0-9 —ÇÉàçêèéïîüùú;:…\\?\\!\\.’‘'”“,\\[\\]]+"));
    }
}
