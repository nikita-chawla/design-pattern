package builder;

public class Main {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder().setUserid("NIKITA123").setUsername("nikita").setEmailid("nikita@example.com").build();
        System.out.println(u1);

        User u2 = User.builder().setEmailid("knds").setUserid("ckdjsnk").setUsername("jkncdks").build();
        System.out.println(u2);
    }
}
