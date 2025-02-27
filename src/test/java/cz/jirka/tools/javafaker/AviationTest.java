package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.IsStringWithContents;
import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AviationTest extends AbstractFakerTest {

    @Test
    public void airport() {
        assertThat(faker.aviation().airport(), MatchesRegularExpression.matchesRegularExpression("\\w{4}"));
    }

    @Test
    public void aircraft() {
        assertThat(faker.aviation().aircraft(), IsStringWithContents.isStringWithContents());
    }

    @Test
    public void metar() {
        assertThat(faker.aviation().METAR(), IsStringWithContents.isStringWithContents());
    }
}
