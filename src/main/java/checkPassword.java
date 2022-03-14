public class checkPassword {

    /**
     * rules for a valid password:
     * 8-25 characters,
     * lower and upper case letters,
     * numbers,
     * at least one special character ()#$?!%/@,
     * no more than two consecutive numbers,
     * no more than three numbers that are the same right after each other
     **/
    public static boolean hasRightLenght(String password) {
        return !(password.length() < 8 || password.length() > 25);
    }

    public static boolean hasUpperCase(String password) {
        return password.matches(".*[A-Z].*");
    }

    public static boolean hasLowerCase(String password) {
        return password.matches(".*[a-z].*");
    }

    public static boolean hasNumbers(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean hasSpecialCharacter(String password) {
        return password.matches(".*[()#$?!%/@].*");
    }

    public static boolean hasConsecutiveNumbers(String password) {
        return password.matches(".*(123|234|345|456|567|678|789).*");
    }

    public static boolean has3SameNumberAfter(String password) {
        return password.matches(".*(1{4,}|2{4,}|3{4,}|4{4,}|5{4,}|6{4,}|7{4,}|8{4,}|9{4,}).*");
    }

    //Wenn .* entfertn wird dann funktioniert der Testcase checkPasswordRight() nicht
    public static boolean hasOnlyLegalChars(String password) {
        return password.matches(".*[^\\w[^()#$?!%/@]].*");
    }


    //least amount of statements
    public static boolean checkPassword(String password) {
        return password != null &&
                hasRightLenght(password) &&
                hasUpperCase(password) &&
                hasLowerCase(password) &&
                hasNumbers(password) &&
                hasSpecialCharacter(password) &&
                !hasConsecutiveNumbers(password) &&
                !has3SameNumberAfter(password) &&
                hasOnlyLegalChars(password);
    }
}