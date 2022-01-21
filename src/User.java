public class User {
    private boolean isWorker;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private double discount;
    private  Boolean clubMember;
    public User(boolean isWorker, String firstName, String lastName,
                String username, String password, double discount, boolean clubMember) {
        this.isWorker = isWorker;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.discount = discount;
        this.clubMember = clubMember;

    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public boolean getIsWorker() {
        return isWorker;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Boolean getClubMember() {return clubMember;}
}