import java.util.ArrayList;
import java.util.Iterator;

public class StudentModel {
  private String firstName;
  private String lastName;
  private String course;
  private String address;
  private String studyID;
  private String email;

  private ArrayList studentView = new ArrayList();

  public StudentModel() {
    this(null);
  }

  public StudentModel(StudentRefInterface view) {
    firstName = "";
    lastName = "";
    course = "";
    address = "";
    studyID = "";
    email = "";

    if (view != null) {
        studentView.add(view);
    }
  }
  public void addContactView(StudentRefInterface view) {
    if (!studentView.contains(view)) {
        studentView.add(view);
    }
  }
  public void remo
}
