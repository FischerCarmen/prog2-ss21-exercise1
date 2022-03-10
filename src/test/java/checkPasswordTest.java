import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//https://github.com/FischerCarmen/prog2-ss21-exercise1
class checkPasswordTest {

    @Test
    void checkPasswordFalse1() {
        String wrong = "viiiiiiieeeeeeeelllllzzzzzzzuuuuuullllaaaannnngggeee";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse2() {
        String wrong = "kurz";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse3() {
        String wrong = "nurkleinbuchstaben";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse4() {
        String wrong = "NURGROẞBUCHSTABEN";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse5() {
        String wrong = "EsFehlenDieZahlen";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse6() {
        String wrong = "KeineSonderzeichn1";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse7() {
        String wrong = "Passwort!234";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse8() {
        String wrong = "Passwort!2222";
        boolean actual = checkPassword.checkPassword(wrong);
        assertSame(false, actual);
    }

    @Test
    void checkPasswordFalse9() {
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