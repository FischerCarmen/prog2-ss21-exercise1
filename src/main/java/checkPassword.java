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
        else if(!password.matches(".*[a-z].*")){
            return false;
        }
        else if(!password.matches(".*[0-9].*")){
            return false;
        }
        else if(!password.matches(".*[()#$?!%/@].*")){
            return false;
        }
        else if(password.matches(".*(123|234|345|456|567|678|789).*")){
            return false;
        }
        else return true;
    }
}
