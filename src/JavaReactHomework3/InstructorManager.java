package JavaReactHomework3;

public class InstructorManager extends UserManager{

    public InstructorManager(BaseLogger logger) {
        super(logger);
    }

    @Override
    public void add(User user) {
        super.add(user);
        System.out.println("Added as a INSTRUCTOR.");

    }
    @Override
    public void remove(User user) {
        super.remove(user);
        System.out.println("Removed from INSTRUCTOR's.");

    }
    @Override
    public void update(User user) {
        super.update(user);
        System.out.println("Updated in INSTRUCTOR's.");

    }
}
