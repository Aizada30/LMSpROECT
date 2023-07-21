import homework.enumm.Gender;
import homework.model.DateBase;
import homework.model.Group;
import homework.model.Student;
import homework.service.GroupService;
import homework.service.StudentsService;
import homework.service.serviceImpl.GroupServiceImpl;
import homework.service.serviceImpl.StudetnsServiceImpl;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Group> groupList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        DateBase dateBase = new DateBase();
        GroupService groupService = new GroupServiceImpl(dateBase);
        StudentsService studentsService = new StudetnsServiceImpl(dateBase);

        timeMethod();


        boolean isTrue = true;
        while (isTrue) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                                        
                    Press 1 to get all groups
                    Press 2 to save new group
                    Press 3 to find group by NAME
                    Press 4 to update GROUP name 
                    Press 5 to close LMS 
                    Press 6 to new student in group
                                        
                    """);
            String number = scanner.nextLine();
            Scanner scan = new Scanner(System.in);
            switch (number) {


                case "1" -> {
                    System.out.println("Groups what you have");
                    groupService.getAllGroupMet(groupList);
                }


                case "2" -> {
                    System.out.print("Enter a new group : ");
                    String name = scan.nextLine();
                    System.out.print("Enter a deckription : ");
                    String deckrip = scan.nextLine();
                    groupService.saveGroup(groupList, name, deckrip);
                }


                case "3" -> {
                    System.out.print("Write name: ");
                    String name = scan.nextLine();
                    groupService.getByGroupNameMet(groupList, name);
                }


                case "4" -> {
                    System.out.print("Enter a old name of group : ");
                    String oldName = scan.nextLine();
                    System.out.print("Enter a new name of group : ");
                    String newName = scan.nextLine();
                    groupService.updateGroupName(oldName, newName, dateBase.getGroupList());
                    System.out.println("Group successfully renamed");
                }


                case "5" -> isTrue = false;
                case "6" -> {

                    System.out.print("Enter a group name : ");
                    String nameOfGroup = scan.nextLine();
                    System.out.println("Enter a first name of student : ");
                    String firsName = scan.nextLine();
                    System.out.println("Enter a last name of student : ");
                    String lastName = scan.nextLine();
                    System.out.println("Enter a email of student : ");
                    String emailStudent = scan.nextLine();
                    System.out.println("Enter a pass of student : ");
                    String pass = scan.nextLine();
                    System.out.println("\nIf you female pass - 1 " +
                            "\nIf you male pass - 2");
                    int gender = scan.nextInt();
                    studentsService.addNewStudentToGroup(groupList, nameOfGroup, firsName, lastName, emailStudent, pass, gender);
                }
                case "7" -> System.out.println(dateBase.getGroupList());
            }
        }
    }


    public static void timeMethod() {
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
        if (LocalTime.now().getHour() < 12 && LocalTime.now().getHour() > 2) {
            System.out.println(" GOOD MORNING ");
        } else if (LocalTime.now().getHour() < 12 && LocalTime.now().getHour() < 17) {
            System.out.println(" GOOD AFTERNOON ");
        } else if (LocalTime.now().getHour() > 17 && LocalTime.now().getHour() < 21) {
            System.out.println(" GOOD NIGHT ");
        } else {
            System.out.println(" GOOD EVENING ");
        }
    }
}