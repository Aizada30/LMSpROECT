package homework.model;

import java.util.ArrayList;
import java.util.List;

public class DateBase {
     private List<Group> groupList = new ArrayList<>();
     private List<Student> students = new ArrayList<>();
     private List<Lesson> lessons = new ArrayList<>();

     public DateBase() {

     }

     public DateBase(List<Group> groupList, List<Student> students, List<Lesson> lessons) {
          this.groupList = groupList;
          this.students = students;
          this.lessons = lessons;
     }

     public List<Group> getGroupList() {
          return groupList;
     }

     public void setGroupList(List<Group> groupList) {
          this.groupList = groupList;
     }

     public List<Student> getStudents() {
          return students;
     }

     public void setStudents(List<Student> students) {
          this.students = students;
     }

     public List<Lesson> getLessons() {
          return lessons;
     }

     public void setLessons(List<Lesson> lessons) {
          this.lessons = lessons;
     }
}
