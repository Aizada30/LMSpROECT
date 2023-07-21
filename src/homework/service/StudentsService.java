package homework.service;

import homework.model.Group;
import homework.model.Student;

import java.util.List;

public interface StudentsService {
    List<Student> addNewStudentToGroup (List<Group>groupList,String nameOfGroup,String nameStudent,String lastName,String email,String pass,int gender);
    List<Student>updateStudentName(List<Student>studentList,String oldName,String newName,String oldLastName,String newLastName);
    List<Student> deleteStudent (String nameOfGroup,String nameOfStudent);
    List<Student> getAllStudent ();


    

}
