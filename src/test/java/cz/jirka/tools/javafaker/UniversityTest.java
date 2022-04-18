package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class UniversityTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.university().name(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z'() ]+"));
    }

    @Test
    public void testPrefix() {
        assertThat(faker.university().prefix(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }

    @Test
    public void testSuffix() {
        assertThat(faker.university().suffix(), MatchesRegularExpression.matchesRegularExpression("\\w+"));
    }
}
