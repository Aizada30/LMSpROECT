package homework.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Long id;
    private String nameOfGroup;
    private String description;
    private List<Lesson> lessonList;
    private List<Student>studentList;

    public Group(){

    }

    public Group(Long id, String nameOfGroup, String description) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
        this.description = description;
    }

    public Group(Long id, String nameOfGroup, String description, List<Lesson> lessonList, List<Student> studentList) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
        this.description = description;
        this.lessonList = lessonList;
        this.studentList = studentList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public List<Student> getStudentList() {
        if(studentList==null){
            studentList=new ArrayList<>();
        }
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    @Override
    public String toString() {
        return "\n          GROUP :      " +
                "\n  ID : " + id +
                "\n NAME OF GROUP : " + nameOfGroup +
                "\n DESCRIPTION : " + description +
                "\n          LESSONS :          " + lessonList +
                "\n          STUDENTS :          " + studentList ;
    }

    public CharSequence getStudents() {
        return null;
    }

    public String getName() {
        return null;
    }
}
