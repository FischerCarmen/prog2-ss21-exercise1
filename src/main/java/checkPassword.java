public class checkPassword {
    /**rules for a valid password:
     * 8-25 characters,
     * lower and upper case letters,
     * numbers,
     * at least one special character ()#$?!%/@,
     * no more than two successive numbers,
     * no more than three numbers that are the same right after each other**/
    public static boolean checkPassword (String password){
        if(password.length()<8||password.length()>25) {
            return false;
        }
        else if(!password.matches(".*[A-Z].*")){
            return false;
        }
        else return true;
    }
}
