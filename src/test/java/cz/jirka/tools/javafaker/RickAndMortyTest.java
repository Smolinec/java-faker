package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class RickAndMortyTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.rickAndMorty().character(), MatchesRegularExpression.matchesRegularExpression("^([\\w'-.]+ ?){2,}$"));
    }

    @Test
    public void location() {
        assertThat(faker.rickAndMorty().location(), MatchesRegularExpression.matchesRegularExpression("^([\\w-.]+ ?){2,}$"));
    }

    @Test
    public void quote() {
        assertThat(faker.rickAndMorty().quote(), not(isEmptyOrNullString()));
    }
}
