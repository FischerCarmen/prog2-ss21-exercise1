import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//https://github.com/FischerCarmen/prog2-ss21-exercise1
class checkPasswordTest {

    @Test
    void checkPasswordToLong() {
        String wrong = "viiiiiiieeeeeeeelllllzzzzzzzuuuuuullllaaaannnngggeee";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordToShort() {
        String wrong = "kurz";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordNoUppercase() {
        String wrong = "nurkleinbuchstaben";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordNoLowercase() {
        String wrong = "NURGROẞBUCHSTABEN";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordNoNumbers() {
        String wrong = "EsFehlenDieZahlen";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordNoSpecialCharacters() {
        String wrong = "KeineSonderzeichn1";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordSuccessiveNumbers() {
        String wrong = "Passwort!234";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordToManySameNumbers() {
        String wrong = "Passwort!2222";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordIllegalCharacters() {
        String wrong = "|\\§\"&={[]}~Aa1!";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordRight() {
        String right = "!1kleinGro?";
        boolean actual = checkPassword.checkPassword(right);
        assertSame(true, actual);
    }
}