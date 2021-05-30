package JavaReactHomework3;

public class Student extends User{
    private double percentage;

    public Student (int id, String firstName, String lastName, String email, String password, String title,
                    double percentage) {
        super(id, firstName, lastName, email, password, title);
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }



}
