public class User {
    private String firstName;
    private String lastName;
    private String egn;

    public User() {
        this.firstName = "Unkown";
        this.lastName = "Unkown";
        this.egn = "Unkown";
    }

    public User(String fName, String lName, String egn) {
        this.firstName = fName;
        this.lastName = lName;
        this.egn = egn;
    }

    public String getEgn() { return this.egn; }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.egn + "\n";
    }
}
