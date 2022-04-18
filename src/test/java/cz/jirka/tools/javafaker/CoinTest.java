package cz.jirka.tools.javafaker;

import static org.junit.Assert.assertThat;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }
}