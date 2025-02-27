package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.repeating.Repeat;
import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class AvatarTest extends AbstractFakerTest {

    @Test
    @Repeat(times=10)
    public void testAvatar() {
        String avatar = faker.avatar().image();
        assertThat(avatar, MatchesRegularExpression.matchesRegularExpression("^https:\\/\\/s3.amazonaws\\.com\\/uifaces\\/faces\\/twitter\\/[a-zA-Z0-9_]+\\/128\\.jpg$"));
    }
}
