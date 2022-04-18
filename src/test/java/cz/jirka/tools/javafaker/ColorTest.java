package cz.jirka.tools.javafaker;

import org.junit.Test;

import static cz.jirka.tools.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class ColorTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.color().name(), matchesRegularExpression("(\\w+ ?){1,2}"));
    }

    @Test
    public void testHex() {
        assertThat(faker.color().hex(), matchesRegularExpression("^#[0-9A-F]{6}$"));
    }

    @Test
    public void testHexNoHashSign() {
        assertThat(faker.color().hex(false), matchesRegularExpression("^[0-9A-F]{6}$"));
    }
}
