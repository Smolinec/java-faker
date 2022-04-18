package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class DragonBallTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.dragonBall().character(), MatchesRegularExpression.matchesRegularExpression("^(\\w+\\.?\\s?-?)+$"));
    }
}
