
public class User {
    private String username;
    private String password;

    //Constructor
    User(String uname, String pword){
        this.username = uname;
        this.password = pword;

    }
    
    // Get method
    public String getUsername(){
        return this.username;
    }
}
