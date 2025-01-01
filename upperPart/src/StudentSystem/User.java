package StudentSystem;

public class User {
    private String username;
    private String passward;
    private String personid;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String passward, String personid, String phoneNumber) {
        this.username = username;
        this.passward = passward;
        this.personid = personid;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassward() {
        return passward;
    }

    public void setUserPassward(String passward) {
        this.passward = passward;
    }

    public String getUserPersonid() {
        return personid;
    }

    public void setUserPersonid(String personid) {
        this.personid = personid;
    }

    public String getUserPhoneNumber() {
        return phoneNumber;
    }

    public void setUserPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    public String toString() {
//       return getUsername()+", "+getUserPassward()+", "+
//              getUserPersonid()+", "+getUserPhoneNumber();
//    }
}
