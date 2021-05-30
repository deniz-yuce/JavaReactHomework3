package JavaReactHomework3;

public class UserManager {
    private BaseLogger logger;

    public UserManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add(User user) {
        System.out.println();
        System.out.println("User "+user.getFirstName()+" "+user.getLastName()+
                " with id: "+user.getId()+" added to the system.");
        this.logger.log();
    }

    public void remove(User user) {
        System.out.println();
        System.out.println("User "+user.getFirstName()+" "+user.getLastName()+
                " with id: "+user.getId()+" removed from the system.");
        this.logger.log();
    }

    public void update(User user) {
        System.out.println();
        System.out.println("User "+user.getFirstName()+" "+user.getLastName()+
                " with id: "+user.getId()+" updated in the system.");
        this.logger.log();
    }

}
