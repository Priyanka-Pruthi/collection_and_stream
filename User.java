public class User {

    private String userName;
    private String role;

    public User(String userName, String role) {
        this.userName = userName;
        this.role = role;
    }

    public User(String userName) {
        this.userName = userName;
        this.role = "Participants";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }



}
