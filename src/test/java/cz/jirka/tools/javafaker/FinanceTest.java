package cz.jirka.tools.javafaker;

import cz.jirka.tools.javafaker.matchers.MatchesRegularExpression;
import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FinanceTest extends AbstractFakerTest {

    @Test
    public void creditCard() {
        for (int i = 0; i < 100; i++) {
            final String creditCard = faker.finance().creditCard();
            assertCardLuhnDigit(creditCard);
        }
    }

    private void assertCardLuhnDigit(String creditCard) {
        final String creditCardStripped = creditCard.replaceAll("-", "");
        assertThat(LuhnCheckDigit.LUHN_CHECK_DIGIT.isValid(creditCardStripped), is(true));
    }

    @Test
    public void bic() {
        assertThat(faker.finance().bic(), MatchesRegularExpression.matchesRegularExpression("([A-Z]){4}([A-Z]){2}([0-9A-Z]){2}([0-9A-Z]{3})?"));
    }

    @Test
    public void iban() {
        assertThat(faker.finance().iban(), MatchesRegularExpression.matchesRegularExpression("[A-Z]{2}\\p{Alnum}{13,30}"));
    }

    @Test
    public void ibanWithCountryCode() {
        assertThat(faker.finance().iban("DE"), MatchesRegularExpression.matchesRegularExpression("DE\\d{20}"));
    }

    @Test
    public void creditCardWithType() {
        for(CreditCardType type : CreditCardType.values()) {
            final String creditCard = faker.finance().creditCard(type);
            assertCardLuhnDigit(creditCard);
        }
    }
}
