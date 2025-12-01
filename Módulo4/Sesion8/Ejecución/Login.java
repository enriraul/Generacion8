public class Login{
    protected String user;
    protected String password;

    public Login(String user, String password){
        this.user = user;
        this.password = password;
    }
    
    public boolean singUP(){
        if( this.user.equalsIgnoreCase("admin") && this.password.equalsIgnoreCase("root")){
            return true;
        }
        else{
            return false;
        }
    }

}