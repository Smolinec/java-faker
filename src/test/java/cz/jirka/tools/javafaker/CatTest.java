package cz.jirka.tools.javafaker;

import org.junit.Test;

import static cz.jirka.tools.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class CatTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.cat().name(), matchesRegularExpression("[A-Za-z'() 0-9-]+"));
    }

    @Test
    public void breed() {
        assertThat(faker.cat().breed(), matchesRegularExpression("[A-Za-z'() 0-9-,]+"));
    }

    @Test
    public void registry() {
        assertThat(faker.cat().registry(), matchesRegularExpression("[A-Za-zé'() 0-9-]+"));
    }
}
