import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}