package builder;

public class User {
    private String userid;
    private String username;
    private String emailid;

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", emailid='" + emailid + '\'' +
                '}';
    }

    private User(UserBuilder userBuilder){
        this.userid = userBuilder.userid;
        this.username= userBuilder.username;
        this.emailid = userBuilder.emailid;
    }
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailid() {
        return emailid;
    }

    //inner class to create object
    static class UserBuilder{
        private String userid;
        private String username;
        private String emailid;

        public UserBuilder(){

        }
        public UserBuilder setUserid(String userid) {
            this.userid = userid;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailid(String emailid) {
            this.emailid = emailid;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
