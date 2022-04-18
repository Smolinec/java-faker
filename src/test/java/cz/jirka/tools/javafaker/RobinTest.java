package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class RobinTest extends AbstractFakerTest {

    @Test
    public void quote() {
        assertThat(faker.robin().quote(), MatchesRegularExpression.matchesRegularExpression("^(\\w+\\.?-?'?\\s?)+(\\(?)?(\\w+\\s?\\.?)+(\\))?$"));
    }
}
