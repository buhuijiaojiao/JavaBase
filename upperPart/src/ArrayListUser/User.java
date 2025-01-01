package ArrayListUser;

public class User {
    private String username;
    private String passward;
    private String id;

    public User() {

    }

    public User(String username, String passward, String id) {
        this.username = username;
        this.passward = passward;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

}
