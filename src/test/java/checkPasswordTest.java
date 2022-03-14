import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//https://github.com/FischerCarmen/prog2-ss21-exercise1
class checkPasswordTest {

    @Test
    void checkPasswordTooLong() {
        String wrong = "viiiiiiieeeeeeeelllllzzzzzzzuuuuuullllaaaannnngggeee";
        assertFalse(checkPassword.hasRightLenght(wrong));
    }

    @Test
    void checkPasswordTooShort() {
        String wrong = "kurz";
        assertFalse(checkPassword.hasRightLenght(wrong));
    }

    @Test
    void checkPasswordNoUppercase() {
        String wrong = "nurkleinbuchstaben";
        assertFalse(checkPassword.hasUpperCase(wrong));
    }

    @Test
    void checkPasswordNoLowercase() {
        String wrong = "NURGROẞBUCHSTABEN";
        assertFalse(checkPassword.hasLowerCase(wrong));
    }

    @Test
    void checkPasswordNoNumbers() {
        String wrong = "EsFehlenDieZahlen";
        assertFalse(checkPassword.hasNumbers(wrong));
    }

    @Test
    void checkPasswordNoSpecialCharacters() {
        String wrong = "KeineSonderzeichn1";
        assertFalse(checkPassword.hasSpecialCharacter(wrong));
    }

    @Test
    void checkPasswordConsecutiveNumbers() {
        String wrong = "Passwort[234";
        assertTrue(checkPassword.hasConsecutiveNumbers(wrong));
    }

    @Test
    void checkPasswordTooManySameNumbers() {
        String wrong = "Passwort!2222";
        assertTrue(checkPassword.has3SameNumberAfter(wrong));
    }

    @Test
    void checkPasswordIllegalCharacters() {
        String wrong = "]}Aa1468?!";
        assertFalse(checkPassword.hasOnlyLegalChars(wrong));
    }

    @Test
    void checkPasswordRight() {
        String right = ")1kleinGro#";
        assertTrue(checkPassword.checkPassword(right));
    }

    @Test
    void checkPasswordNull() {
        String wrong = null;
        assertFalse(checkPassword.checkPassword(wrong));
    }
}