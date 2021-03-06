package registration.model;

/**
 * Factory method pattern: Concrete product
 */
public class Admin extends User {

    public Admin(UserInfo userInfo) {
        super(userInfo);
    }

    @Override
    public void register() {
        System.out.println(String.format("Register admin %s", userInfo));
    }

}
