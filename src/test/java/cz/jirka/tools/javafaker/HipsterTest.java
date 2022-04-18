package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class HipsterTest extends AbstractFakerTest {

    @Test
    public void word() {
        assertThat(faker.hipster().word(), MatchesRegularExpression.matchesRegularExpression("^([\\w-+&']+ ?)+$"));
    }
}
