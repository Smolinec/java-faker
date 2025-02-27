package cz.jirka.tools.javafaker;

import static org.junit.Assert.assertThat;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class CurrencyTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.currency().name(), MatchesRegularExpression.matchesRegularExpression("[\\w\\'\\.\\-\\(\\) ]+"));
    }

    @Test
    public void testCode() {
        final Currency currency = faker.currency();
        assertThat(currency.code(), MatchesRegularExpression.matchesRegularExpression("[A-Z]{3}"));
    }

}
