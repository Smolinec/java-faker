package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AnimalTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.animal().name(), MatchesRegularExpression.matchesRegularExpression("[A-Za-z ]+"));
    }

}
