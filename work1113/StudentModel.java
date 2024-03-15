public class StudentModel {
    private String firstName;
    private String lastName;
    private String stuid;
    private String course;
    private String address;
    private String email;

    public StudentModel(String firstName, String lastName, String stuid, String course, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stuid = stuid;
        this.course = course;
        this.address = address;
        this.email = email;
    }

    // Getter methods

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStuid() {
        return stuid;
    }

    public String getCourse() {
        return course;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
