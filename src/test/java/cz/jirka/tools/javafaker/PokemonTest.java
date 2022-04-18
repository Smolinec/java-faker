package cz.jirka.tools.javafaker;

import static org.junit.Assert.assertThat;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

public class PokemonTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.pokemon().name(), MatchesRegularExpression.matchesRegularExpression("[\\w']+.?( \\w+)?"));
    }

    @Test
    public void location() {
        assertThat(faker.pokemon().location(), MatchesRegularExpression.matchesRegularExpression("\\w+( \\w+)?( \\w+)?"));
    }
}
