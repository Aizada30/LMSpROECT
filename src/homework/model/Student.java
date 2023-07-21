package homework.model;

import homework.enumm.Gender;

import java.util.List;

public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    private List<Lesson> lessonList;

    private List<Group> groupList;
    public Student (){

    }

    public Student(Long id, String firstName, String lastName, String email, String password, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public Student(Long id, String firstName, String lastName, String email, String password, String gender, List<Lesson> lessonList, List<Group> groupList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.lessonList = lessonList;
        this.groupList = groupList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return "\n           STUDENT :  " +
                "\nID : " + id +
                "\nFIRST NAME : " + firstName +
                "\nLAST NAME : " + lastName +
                "\nEMAIL : " + email +
                "\nPASSWORD : " + password +
                "\nGENDER : " + gender +
                "\n          LESSONS : " + lessonList;
    }
}
