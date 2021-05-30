package JavaReactHomework3;

public class StudentManager extends UserManager{

    public StudentManager(BaseLogger logger) {
        super(logger);
    }

    @Override
    public void add(User user) {
        super.add(user);
        System.out.println("Added as a STUDENT.");

    }
    @Override
    public void remove(User user) {
        super.remove(user);
        System.out.println("Removed from STUDENT's.");

    }
    @Override
    public void update(User user) {
        super.update(user);
        System.out.println("Updated in STUDENT's.");

    }
}
