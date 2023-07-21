package homework.service.serviceImpl;

import com.sun.security.auth.module.UnixSystem;
import homework.enumm.Gender;
import homework.model.CheckInfo;
import homework.model.DateBase;
import homework.model.Group;
import homework.model.Student;
import homework.service.StudentsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudetnsServiceImpl implements StudentsService {

    private DateBase dateBase;

    public StudetnsServiceImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    private long counter;//        Student student = new Student();
//        Group group = new Group();
//        List<Student> students = new ArrayList<>();
//        boolean isTrue = true;
//        boolean isTrueFirstNameAndLastName = true;
//        boolean isTrueEmail = true;
//        boolean isTreuGender = true;
//        boolean isTruePassword = true;
//        while(isTrue) {
//            while (isTrueFirstNameAndLastName) {
//                try {
//                    if (!firstName.matches("-?\\d+") && !lastName.matches("-?\\d")) {
//                        boolean isFalse = false;
//                        if (!groups.isEmpty()) {
//                            for (Group g : groups) {
//                                if (g.getStudents().isEmpty()) {
//                                    for (Student s : g.getStudentList()) {
//                                        if (s.getFirstName().contains(firstName) && !s.getLastName().contains(lastName)) {
//                                            student.setFirstName(firstName);
//                                            student.setLastName(lastName);
//                                            isTrueFirstNameAndLastName = false;
//                                        } else {
//                                            isFalse = true;
//                                        }
//                                    }
//                                } else {
//                                    student.setFirstName(firstName);
//                                    student.setLastName(lastName);
//                                    isTrueFirstNameAndLastName = false;
//                                }
//                            }
//                        } else {
//                            student.setFirstName(firstName);
//                            student.setLastName(lastName);
//                            isTrueFirstNameAndLastName = false;
//                        }
//                        if (isFalse) {
//                            throw new CheckInfo("This name already exists");
//                        } else {
//                            throw new CheckInfo("Name can't be the number");
//                        }
//                    }
//                } catch (CheckInfo e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            while (isTrueEmail) {
//                try {
//                    boolean chekEmail = false;
//                    System.out.println(email.toLowerCase());
//                    if (email.contains("@") && email.contains("gmail.com")) {
//                        for (Group g : groups) {
//                            if (!g.getStudents().isEmpty()) {
//                                for (Student s : students) {
//                                    if (!s.getEmail().contains(email)) {
//                                        student.setEmail(email);
//                                        isTrueEmail = false;
//                                        break;
//                                    } else {
//                                        chekEmail = true;
//                                    }
//                                }
//                            } else {
//                                student.setEmail(email);
//                                isTrueEmail = true;
//                            }
//                        }
//                    }else {
//                        throw new CheckInfo("You have not correct write the email");
//                    }
//                    if (chekEmail) {
//                        throw new CheckInfo("No such email ");
//                    }
//                } catch (CheckInfo e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//
//            while (isTreuGender) {
//                try {
//                    switch (gender) {
//                        case 1 -> {
//                            student.setGender(Gender.FAMAIL);
//                            isTreuGender = false;
//                        }
//                        case 2 -> {
//                            student.setGender(Gender.MALE);
//                            isTreuGender = false;
//                        }
//                        default -> throw new CheckInfo("Enter your gender ");
//                    }
//
//                } catch (CheckInfo e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            while (isTruePassword) {
//                try {
//                    boolean isFalseLength = false;
//                    if (password.length() >= 7) {
//                        student.setPassword(password);
//                        isTruePassword = false;
//                        break;
//                    } else {
//                        isFalseLength = true;
//                    }
//                    if (isFalseLength) {
//                        throw new CheckInfo("Password must be have length no large 7");
//                    }
//                } catch (CheckInfo e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//
//        }for (Group g:groups) {
//            if(g.getNameOfGroup().equalsIgnoreCase(groupName)){
//                counter++;
//                student.setId(counter);
//                g.getStudentList().add(student);
//                isTrue=false;
//                break;
//            }
//        }
//        dateBase.setStudents(students);
//        return dateBase.getStudents();}


    @Override
    public List<Student> addNewStudentToGroup(List<Group>groupList,String nameOfGroup, String nameStudent, String lastName, String email, String pass, int gender) {
        Group group = new Group();
        Student student = new Student();
        List<Student> students = new ArrayList<>();
        boolean isTrue = true;
        boolean isTrueNameAndLastName = true;
        boolean isTrueEmail = true;
        boolean isTrueAge = true;
        boolean isTrueGender = true;
        boolean isTruePassword = true;
        while (isTrue) {
            while (isTrueNameAndLastName) {
                try {
                    if (!nameStudent.matches("-?\\d+") && !lastName.matches("-?\\d+")) {
                        boolean isFalse = false;
                        if (!groupList.isEmpty()) {
                            for (Group g : groupList) {
                                if (!g.getStudents().isEmpty()) {
                                    for (Student s : g.getStudentList()) {
                                        if (!s.getFirstName().contains(nameStudent) && !s.getLastName().contains(lastName)) {
                                            student.setFirstName(nameStudent);
                                            student.setLastName(lastName);
                                            isTrueNameAndLastName = false;
                                        } else {
                                            isFalse = true;
                                        }
                                    }
                                } else {
                                    student.setFirstName(nameStudent);
                                    student.setLastName(lastName);
                                    isTrueNameAndLastName = false;
                                }
                            }
                        } else {
                            student.setFirstName(nameStudent);
                            student.setLastName(lastName);
                            isTrueNameAndLastName = false;
                        }
                        if (isFalse) {
                            throw new CheckInfo("takaya familiya uje sushestvuet");
                        }
                    } else {
                        throw new CheckInfo("name can't be nubmer");
                    }
                } catch (CheckInfo e) {
                    System.out.println(e.getMessage());
                }
            }

            while (isTrueEmail) {
                try {
                    boolean checkEmail = false;
                    if (email.contains("@gmail")) {
                        for (Group g : groupList) {
                            if (!g.getStudents().isEmpty()) {
                                for (Student s : g.getStudentList()) {
                                    if (!s.getEmail().contains(email)) {
                                        student.setEmail(email);
                                        isTrueEmail = false;
                                        break;
                                    } else {
                                        checkEmail = true;
                                    }
                                }
                            } else {
                                student.setEmail(email);
                                isTrueEmail = false;
                            }
                        }
                    } else {
                        throw new CheckInfo("not correct email ");
                    }
                    if (checkEmail) {
                        throw new CheckInfo("Takaya pchta uje ect");
                    }
                } catch (CheckInfo e) {
                    System.out.println(e.getMessage());
                }
            }
            while (isTrueGender) {
                try {
                    switch (gender) {
                        case 1 -> {
                            String.valueOf(Gender.MALE);
                            isTrueGender = false;
                        }
                        case 2 -> {
                            String.valueOf(Gender.FAMAIL);
                            isTrueGender = false;
                        }
                        default -> throw new CheckInfo("Choose your gender: ");
                    }
                } catch (CheckInfo e) {
                    isTrueGender = true;
                    System.out.println(e.getMessage());
                }
            }
            while (isTruePassword) {
                try {
                    boolean isFalseLength = false;
                    if (pass.length() >= 8) {
                        student.setPassword(pass);
                        isTruePassword = false;
                        break;
                    } else {
                        isFalseLength = true;
                    }
                    if (isFalseLength) {
                        throw new CheckInfo("Password must contains 8 symvols");
                    }
                } catch (CheckInfo e) {
                    isTruePassword = true;
                    System.out.println(e.getMessage());
                }
            }
            for (Group g : groupList) {
                if (g.getName().equalsIgnoreCase(nameOfGroup)) {
                    counter++;
                    student.setId(counter);
                    g.getStudentList().add(student);
                    isTrue = false;
                    break;
                }
            }dateBase.getStudents().add(student);
        }return dateBase.getStudents();
    }

    @Override
    public List<Student> updateStudentName(List<Student> studentList, String oldName, String newName, String oldLastName, String newLastName) {

        return null;
    }

    @Override
    public List<Student> deleteStudent(String nameOfGroup, String nameOfStudent) {

        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return dateBase.getStudents();
    }
}

