package JavaReactHomework3;

public class Instructor extends User{
    private double rating;

    public Instructor(int id, String firstName, String lastName, String email, String password, String title,
                      double rating) {
        super(id, firstName, lastName, email, password, title);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
