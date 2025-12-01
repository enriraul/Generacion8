public class LoginToken extends Login{
    private String token;

    public LoginToken(String user, String password, String token){
        super(user, password);
        this.token = token;
    }
    @Override
    public boolean singUP(){
        if( super.user.equalsIgnoreCase("admin") 
        && super.password.equalsIgnoreCase("root")
        && this.token.equalsIgnoreCase("1234")){
            return true;
        }
        else{
            return false;
        }
    }
}