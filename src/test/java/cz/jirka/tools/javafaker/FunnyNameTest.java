package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FunnyNameTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.funnyName().name(), MatchesRegularExpression.matchesRegularExpression("^(\\w+\\.?\\s?'?-?)+$"));
    }
}
