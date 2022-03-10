public class checkPassword {
    /**rules for a valid password:
     * 8-25 characters,
     * lower and upper case letters,
     * numbers,
     * at least one special character ()#$?!%/@,
     * no more than two successive numbers,
     * no more than three numbers that are the same right after each other**/
   /* public static boolean checkPassword (String password){
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
        else if(password.matches(".*(1{4,}|2{4,}|3{4,}|4{4,}|5{4,}|6{4,}|7{4,}|8{4,}|9{4,}).*")){
            return false;
        }
        else return !password.matches(".*(^A-Z|^a-z|^0-9|[^()#$?!%/@$]).*");
    }*/

    //least amount of statement
    public static boolean checkPassword (String password){
        return (password.length()<8||password.length()>25)&&
                (!password.matches(".*[A-Z].*"))&&
                (!password.matches(".*[a-z].*"))&&
                (!password.matches(".*[0-9].*"))&&
                (!password.matches(".*[()#$?!%/@].*"))&&
                (password.matches(".*(123|234|345|456|567|678|789).*"))&&
                (password.matches(".*(1{4,}|2{4,}|3{4,}|4{4,}|5{4,}|6{4,}|7{4,}|8{4,}|9{4,}).*"))&&
                (!password.matches(".*(^A-Z|^a-z|^0-9|[^()#$?!%/@$]).*"));
    }
}
