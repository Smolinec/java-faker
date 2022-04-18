package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class GenderTest extends AbstractFakerTest {

    @Test
    public void types() {
        assertThat(faker.gender().types(), MatchesRegularExpression.matchesRegularExpression("(\\w+ ?){1,2}"));
    }

    @Test
    public void binaryTypes() {
        assertThat(faker.gender().binaryTypes(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void shortBinaryTypes() {
        assertThat(faker.gender().shortBinaryTypes(), MatchesRegularExpression.matchesRegularExpression("f|m"));
    }

}
